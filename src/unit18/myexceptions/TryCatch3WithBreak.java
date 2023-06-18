package unit18.myexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch3WithBreak {
    public static void main(String[] args) {


        //  System.out.println("test");
        int result = 0;
        int num1 = 0;
        int num2 = 0;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter your first number:");
                // HACKER: scanner.close();
                num1 = scanner.nextInt();
                System.out.println("Please enter your second number:");
                num2 = scanner.nextInt();
                result = num1 / num2;
                break;
            } catch (InputMismatchException e) {
                System.out.println("You entered the wrong input");

            } catch (ArithmeticException e) {
                System.out.println("You cannot divide by 0");

                System.out.println(num1 + "/" + num2 + " = " + result);

            } catch (Exception e) {
                System.out.println("Oops, something went wrong");

            }
        }

    }
}
