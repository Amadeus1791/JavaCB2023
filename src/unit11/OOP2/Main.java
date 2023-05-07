package unit11.OOP2;

import unit11.OOP1.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Franz", "Maier", 19);
        Person p2 = new Person("Kathi", "Mueller", 15);
        Person p3 = new Person("Hans", "Schmidt");

        Couple couple = new Couple(p2, p1);
        MyDate date = new MyDate(2, 14, 2,30);

        Wedding wedding = new Wedding(couple, date);


    }


}
