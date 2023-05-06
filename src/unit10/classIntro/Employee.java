package unit10.classIntro;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    //fields
    String firstName;
    String lastName;
    int age;
    int salary;
    char gender;
    LocalDate entryDate;

    // methods
    void eat() {
        System.out.println(firstName+" "+lastName+ " is eating");
    }

    void printSalary() {
        System.out.println("the salary of "+lastName+"is: "+salary);
    }

    void raiseSalary(int percentage) {
        //salary += (salary / 100) * percentage;
        salary+= salary * percentage/100;

    }

    void printEmployee() {
        System.out.println("Employee: "+
                firstName+" "+lastName+
                "\nage: "+age+
                "\ngender: "+gender+
                "\nentry date: "+entryDate+
                "\nsalary: "+salary);
    }
}
