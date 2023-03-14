package unit02;

import java.util.Scanner;

public class TellMeYourNumber {
    // type in your number between 0 and 10

    // number >5
    // even number
    // number too big

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type in your number between 1 and 10");
       // int number = scan.nextInt();
        int number = 8;
        System.out.println("Your number is " + number);

        System.out.println("Your number is valid");
        if (number > 5 && number % 2 == 0) {
            System.out.println("your number is greater than 5 and even");
        }
        if (number > 3) {
            System.out.println("your number is greater than 3");
        }

    }

}
