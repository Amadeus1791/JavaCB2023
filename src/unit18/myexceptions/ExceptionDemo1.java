package unit18.myexceptions;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static double division() {
        Scanner scan = new Scanner(System.in);
        double numerator;
        double denominator;
        double result;
        System.out.println("Please enter the numerator: ");
        numerator = scan.nextDouble();
        System.out.println("Please enter the denominator: ");
        denominator = scan.nextDouble();
        result = numerator / denominator;
        System.out.println("Your result is: " + result);
        return result;
    }

    public static void main(String[] args) {
        division();
    }

}
