package unit01;

public class Operator {
    public static void main(String[] args) {
        int num1 = 30, num2 = 23;
        System.out.println("Your number are: " + num1 + " and " + num2);

        // Using conditional operators
        System.out.println("num1 == num2? " + (num1 == num2));
        System.out.println("num1 != num2? " + (num1 != num2));
        System.out.println("num1 > num2? " + (num1 > num2));
        System.out.println("num1 < num2? " + (num1 < num2));
        System.out.println("num1 >= num2? " + (num1 >= num2));
        System.out.println("num1 <= num2? " + (num1 <= num2));

        // Using logical operators
        System.out.println("Result of logical AND is " + ((num1 > num2) && (num1 == num2)));
        System.out.println("Result of logical OR is " + ((num1 > num2) || (num1 == num2)));
    }
}

