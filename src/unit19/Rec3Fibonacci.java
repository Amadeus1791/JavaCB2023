package unit19;

public class Rec3Fibonacci {
    public static void main(String[] args) {
        fibonacci(5);
    }

    static int fibonacci(int n) {
        System.out.println("Entering fib: n = "+ n);
        if (n == 0){
            System.out.println("exiting fib: n = "+ n + " and return value is 0");
            return 0;
        }
        else if (n == 1) {
            System.out.println("exiting fib: n = "+ n + " and return value is 1");
            return 1;
        }
        int fib = fibonacci(n - 1) + fibonacci(n - 2);
        System.out.println("exiting fib: n = "+ n + " and return value is "+fib);
        return fib;
    }
}
