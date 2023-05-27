package unit12.inheritance1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Hans", "Mayer", 45, 'm');
       // p1.printPerson();
        //System.out.println(p1.toEMail("gmail.com"));

        Employee e1 = new Employee("Bill", "Gates", 63, 'm', 6940302);
        //.printPerson();

        Trainee t1 = new Trainee("Anna", "Mueller", 18, 'f', LocalDate.of(2023, 9, 10));
       // t1.printPerson();

        Person[] persons = {p1, e1, t1};
        for (int i = 0; i < persons.length; i++) {
            persons[i].printPerson();
        }

        Number[] numbers = { new Integer(3), new Double(3.4)};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
