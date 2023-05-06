package unit10.classintro3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        circle1.printComplete();
        circle2.printComplete();
        circle1.printComplete();
        circle1.printComplete();
        System.out.println("radius of circle1 is: "+ circle1.getRadius());
        circle2.setRadius(10);
        circle2.printComplete();

        System.out.println("num= "+ Circle.getNumberOfCreatedCircle());
    }
}
