package unit12.inheritance1;

import java.time.LocalDate;

public class Trainee extends Person {
    LocalDate dueDate;

    public Trainee(String firstName, String lastName, int age, char gender, LocalDate dueDate) {
        super(firstName, lastName, age, gender);
        this.dueDate = dueDate;
    }

    void printMessage() {
        System.out.println("Mädchen für alles bis " + dueDate.toString());
    }

    @Override
    void printPerson() {
        super.printPerson();
        System.out.println("DueDate " + dueDate);
    }
}
