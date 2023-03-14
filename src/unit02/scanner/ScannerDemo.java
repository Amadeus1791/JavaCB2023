package unit02.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer value:");
        int intValue = s.nextInt();
        System.out.println("Enter a decimal value:");
        float floatValue = s.nextFloat();
        System.out.println("Enter a String value");
        String strValue = s.next();
        System.out.println("Values you entered are: ");
        System.out.println(intValue + " " + floatValue + " " + strValue);

    }
}