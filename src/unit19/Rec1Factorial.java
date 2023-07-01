package unit19;

import java.math.BigInteger;

public class Rec1Factorial {
    public static void main(String[] args) {
        System.out.println(factorialDebug(5));
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int factorialDebug(int n) {
        System.out.println("Entering function with n= "+ n);
        if (n <= 1) {
            System.out.println("Exiting function with n= "+n +" and return value is hardcoded 1");
            return 1;
        }
        int returnValue = n * factorialDebug(n - 1);
        System.out.println("Exiting function with n= "+n+ " and return value is "+ returnValue);
        return returnValue;






    }

    static long factorialWithLong(long n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialWithLong( n - 1);
    }
}


