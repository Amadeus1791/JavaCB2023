package unit02.scanner;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {

    }


    public static void intro0() {
        Scanner input = new Scanner(System.in);

        int number1; // first number
        int number2; // second number

        System.out.print("Enter first integer: "); // prompt for input
        number1 = input.nextInt(); // read first integer

        System.out.print("Enter second integer: "); // prompt for input
        number2 = input.nextInt(); // read second integer

        // display results
        System.out.printf("%nSum is %d%n", (number1 + number2));
        System.out.printf("Product is %d%n", (number1 * number2));
        System.out.printf("Difference is %d%n", (number1 - number2));
        System.out.printf("Quotient is %d%n", (number1 / number2));
    }


    public static void intro1() {

        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        int x; // first number input by user
        int y; // second number input by user
        int z; // third number input by user
        int result; // product of numbers

        System.out.print("Enter first integer: "); // prompt for input
        x = input.nextInt(); // read first integer

        System.out.print("Enter second integer: "); // prompt for input
        y = input.nextInt(); // read second integer

        System.out.print("Enter third integer: "); // prompt for input
        z = input.nextInt(); // read third integer

        result = x * y * z; // calculate product of numbers

        System.out.printf("Product is %d%n", result);
    }

    //CHALLENGE
    static void circle() {
        Scanner input = new Scanner(System.in);

        int radius; // radius of circle

        System.out.print("Enter radius: "); // prompt for input
        radius = input.nextInt(); // read number

        System.out.printf("Diameter is %d%n", (2 * radius));
        System.out.printf("Circumference is %f%n",
                (2 * Math.PI * radius));
        System.out.printf("Area is %f%n", (Math.PI * radius * radius));
    }





}
