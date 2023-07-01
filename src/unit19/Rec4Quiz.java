package unit19;

public class Rec4Quiz {
    public static void main(String[] args) {
        someMethod2(1234);
    }

    static int someMethod1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + someMethod1(n - 1);
        }
    }

    //1234 : 10
    //123
    //12
    //1
    //BASE CASE

    static void someMethod2(int n) {
        if (n > 0) {
            System.out.println("enter function with n "+ n);
            someMethod2(n / 10);
            System.out.println(n % 10);
        }
        // 123 % 10 = 3

    }

    // Input: 1234
    static int someMethod3(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n < 10) {
                return 1;
            } else {
                return 1 + someMethod3(n / 10);
            }
        }
    }
}


