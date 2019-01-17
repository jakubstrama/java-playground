import service.PlaygroundService;

public class Main {

    public static void main(String[] args) {
        PlaygroundService playgroundService = new PlaygroundService();

        System.out.println("Average age in the company: " + playgroundService.averageAge());
        assert playgroundService.averageAge() == 37.8 : "Average age should be 37.8";

        System.out.println("Longest working employee worked for: " + playgroundService.mostYearsEmployed());
        assert playgroundService.mostYearsEmployed() == 23: "Longest working employee should be 23";

        System.out.println("Number of male employees: " + playgroundService.maleEmployeeCount());
        assert playgroundService.maleEmployeeCount() == 9 : "Number of male employees should be 9";

        System.out.println("Year most people joined: " + playgroundService.yearMostPeopleJoined());
        assert playgroundService.yearMostPeopleJoined() == 2011 : "Year most people joined should be 2011";

    }
}
