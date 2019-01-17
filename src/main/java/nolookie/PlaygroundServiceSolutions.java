package nolookie;

import model.Employee;
import model.Gender;
import service.EmployeeService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class PlaygroundServiceSolutions {

    private List<Employee> employees;

    public PlaygroundServiceSolutions() {
        EmployeeService employeeService = new EmployeeService();
        this.employees = employeeService.generateItems();
    }


    public Double averageAge() {
        return employees.stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0.0);

//        return 0.0;
    }

    public Long mostYearsEmployed() {
        return employees.stream()
                .max((e1, e2) -> e2.getDateJoined().compareTo(e1.getDateJoined()))
                .map(Employee::getDateJoined)
                .map(date -> ChronoUnit.YEARS.between(date, LocalDate.now()))
                .orElse(0L);

//        return 0;
    }

    public Long maleEmployeeCount() {
        return employees.stream()
                .filter(e -> Gender.MALE.equals(e.getGender()))
                .count();

//        return 0l;
    }

    public Integer yearMostPeopleJoined() {
        return employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDateJoined().getYear(), counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(0);

//        return 0;
    }

}
