package unit03;

import java.util.Scanner;

public class Small {

    // finds the smallest integer
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int smallest = 0; // smallest number
        int number = 0; // number entered by user
        int integers; // number of integers

        System.out.print("Enter number of integers: ");
        integers = input.nextInt();

        for (int counter = 1; counter <= integers; counter++) {
            System.out.print("Enter integer: ");
            number = input.nextInt();

            if (counter == 1)
                smallest = number;
            else if (number < smallest)
                smallest = number;
        }

        System.out.printf("Smallest Integer is: %d%n", smallest);
    }
} // end class Small

