package unit03;

import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("How many numbers do you want?");

        int numberOfInputs = scanner.nextInt();


        while (numberOfInputs > 0) {

            System.out.println("Please type in your number:");
            int num = scanner.nextInt();
            while (num < 0) {
                System.out.println("Please type in only a positive number");
                num = scanner.nextInt();
            }

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            System.out.println("Your number is: " + num);
            numberOfInputs--;
        }
        System.out.println("Your largest value is "+ max);
        System.out.println("Your smallest value is "+ min);
    }
}
