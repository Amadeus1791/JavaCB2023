package unit12.inheritance1;

public class Employee extends Person {
    double salary;

    public Employee(String firstName, String lastName, int age, char gender, double salary) {
        super(firstName, lastName, age, gender);
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Your salary at the moment is " + salary);
    }

    void raiseSalary(double amount) {
        salary += amount;
    }

    @Override
    void printPerson() {
        super.printPerson();
        System.out.println("salary= " + salary);
    }
}
