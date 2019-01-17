package model;

import java.time.LocalDate;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final Gender gender;
    private final Integer age;
    private final String jobTitle;
    private final LocalDate dateJoined;

    public Employee(String firstName, String lastName, Gender gender, Integer age, String jobTitle, LocalDate dateJoined) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.dateJoined = dateJoined;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public Gender getGender() {
        return gender;
    }

}
