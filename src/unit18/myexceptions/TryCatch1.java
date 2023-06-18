package unit18.myexceptions;

import java.util.Scanner;

public class TryCatch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  System.out.println("test");
        int result = 0;
        int num1 = 0;
        int num2 = 0;
        try {
            System.out.println("Please enter your first number:");
            num1 = scanner.nextInt();
            System.out.println("Please enter your second number:");
            num2 = scanner.nextInt();
            result = num1 / num2;

        } catch (Exception e) {
            System.out.println("Oops, something went wrong");
        }

        System.out.println(num1 + "/" + num2 + " = " + result);

    }
}
