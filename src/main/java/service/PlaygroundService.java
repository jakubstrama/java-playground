package service;

import model.Employee;
import model.Gender;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlaygroundService {

    private final List<Employee> employees;

    public PlaygroundService() {
        EmployeeService employeeService = new EmployeeService();
        this.employees = employeeService.generateItems();
    }


    public Double averageAge() {

        return employees.stream()
                .mapToDouble(Employee::getAge)
                .average()
                .orElse(0);
    }

    public Long mostYearsEmployed() {

        int mostYears = employees.stream()
                .mapToInt(e -> Period.between(e.getDateJoined(), LocalDate.now()).getYears())
                .max()
                .orElse(0);

        return Long.valueOf(mostYears);
    }

    public Long maleEmployeeCount() {

        return employees.stream()
                .filter(e -> e.getGender().equals(Gender.MALE))
                .count();
    }

    public Integer yearMostPeopleJoined() {

        Map<Integer, Long> counters = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDateJoined().getYear(), Collectors.counting()));


        return Collections.max(counters.entrySet(), Comparator.comparingLong(e -> e.getValue())).getKey();
    }

}
