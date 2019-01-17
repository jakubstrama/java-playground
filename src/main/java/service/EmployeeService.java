package service;

import model.Gender;
import model.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmployeeService {

    public List<Employee> generateItems() {
        return getItems();
    }


    private List<Employee> getItems() {
        return Arrays.asList(
                new Employee("Luisa", "Ribbentrop", Gender.FEMALE, 45, "Senior Quality Assurance Engineer", LocalDate.of(1999, 3, 27)),
                new Employee("Fabienne", "Steinhaeusser", Gender.FEMALE, 28, "Junior Technology Consultant", LocalDate.of(2012, 4, 12)),
                new Employee("Walburga", "Bartels", Gender.FEMALE, 60, "Junior Branch Manager", LocalDate.of(2003, 3, 1)),
                new Employee("Hella", "Felgenhauer", Gender.FEMALE, 43, "Senior Marketing Consultant", LocalDate.of(2015, 6, 1)),
                new Employee("Michelle", "Schwerner", Gender.FEMALE, 19, "Junior Quality Assurance Consultant", LocalDate.of(2017, 3, 6)),
                new Employee("Yasmin", "Dreyfuss", Gender.FEMALE, 35, "Quality Assurance Engineer", LocalDate.of(2002, 7, 7)),
                new Employee("Cornelia", "Hitzig", Gender.FEMALE, 30, "Marketing Consultant", LocalDate.of(2002, 12, 25)),
                new Employee("Juliane", "Dörflinger", Gender.FEMALE, 22, "Junior Marketing Consultant", LocalDate.of(2006, 7, 23)),
                new Employee("Saskia", "Kirchweger", Gender.FEMALE, 23, "Junior Software Engineer", LocalDate.of(2011, 11, 3)),
                new Employee("Judith", "Bitterlich", Gender.FEMALE, 48, "Senior Technology Consultant", LocalDate.of(2012, 2, 13)),
                new Employee("Rosa", "Kretschmer", Gender.FEMALE, 51, "Junior Technology Consultant", LocalDate.of(2011, 8, 15)),

                new Employee("Jonathan", "Nimitz", Gender.MALE, 51, "Senior Marketing Consultant", LocalDate.of(1997, 8, 23)),
                new Employee("Ronald", "Krantz", Gender.MALE, 30, "Software Engineer", LocalDate.of(1995, 3, 2)),
                new Employee("Jan", "Müller", Gender.MALE, 44, "Senior Branch Manager", LocalDate.of(2015, 9, 29)),
                new Employee("Wolfgang", "Sommer", Gender.MALE, 40, "Senior Technology Consultant", LocalDate.of(2018, 3, 22)),
                new Employee("Augustin", "Weindorf", Gender.MALE, 35, "Software Engineer", LocalDate.of(2009, 12, 23)),
                new Employee("Wenzel", "Dittrich", Gender.MALE, 45, "Senior Technology Consultant", LocalDate.of(2003, 6, 13)),
                new Employee("Hildebrant", "Pasche", Gender.MALE, 39, "Senior Division Manager", LocalDate.of(2011, 5, 3)),
                new Employee("Jens", "Kreutzberg", Gender.MALE, 20, "Junior Quality Assurance Engineer", LocalDate.of(2017, 2, 22)),
                new Employee("Albrecht", "Pölzl", Gender.MALE, 48, "Senior Marketing Consultant", LocalDate.of(2000, 1, 1))
                );
    }

}
