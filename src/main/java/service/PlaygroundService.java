package service;

import model.Employee;
import model.Gender;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class PlaygroundService {

    private final List<Employee> employees;

    public PlaygroundService() {
        EmployeeService employeeService = new EmployeeService();
        this.employees = employeeService.generateItems();
    }


    public Double averageAge() {

//        OptionalDouble result = employees.stream()
//                .mapToDouble(Employee::getAge)
//                .average();
//
//        if (result.isPresent()) {
//            return result.getAsDouble();
//        } else
//        {
//            return (double) 0;
//        }

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

        return (long) mostYears;
    }

    public Long maleEmployeeCount() {

        return employees.stream()
                .filter(e -> e.getGender() == Gender.MALE)
                .count();
    }

    public Integer yearMostPeopleJoined() {

        Map<Integer, Long> counters = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDateJoined().getYear(), Collectors.counting()));


        return Collections.max(counters.entrySet(), Comparator.comparingLong(Map.Entry::getValue)).getKey();
    }

}
