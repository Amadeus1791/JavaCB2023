package unit10.classIntro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee steveJobs = new Employee();
        steveJobs.firstName = "Steve";
        steveJobs.lastName = "Jobs";
        steveJobs.age = 45;
        steveJobs.salary = 5000;
        steveJobs.gender = 'm';

        steveJobs.entryDate = LocalDate.of(1970,10,3);
        steveJobs.eat();
        steveJobs.printSalary();
        steveJobs.raiseSalary(50);
        steveJobs.printSalary();
        steveJobs.printEmployee();

    }
}
