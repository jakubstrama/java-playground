package service;

import model.Employee;

import java.util.List;

public class PlaygroundService {

    private List<Employee> employees;

    public PlaygroundService() {
        EmployeeService employeeService = new EmployeeService();
        this.employees = employeeService.generateItems();
    }


    public Double averageAge() {
        return 0.0;
    }

    public Long mostYearsEmployed() {
        return 0L;
    }

    public Long maleEmployeeCount() {
        return 0L;
    }

    public Integer yearMostPeopleJoined() {
        return 0;
    }

}
