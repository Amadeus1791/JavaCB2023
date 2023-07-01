package unit19;

public class Rec2PrintStatements {
    public static void main(String[] args) {
        //printNumbersIterativeDesc(10);
        printNumbersRecursiveDesc3(5);
    }

    // 10 , 9 , 8, 7, ....1,
    // printNumbers(10)


    static void printNumbersIterativeDesc(int n) {
        for (int i = n; i > 0; i--) {
            System.out.print(i + ", ");
        }
    }

    static void printNumbersRecursiveDesc1(int n) {
        // Base case
        if (n <= 1) {
            System.out.print(n);
        } else {
            System.out.print(n + ",");
            // Recursive call
            printNumbersRecursiveDesc1(n - 1);
        }
    }

    static void printNumbersRecursiveDesc2(int n) {
        // Base case
        if (n > 1) {
            System.out.print(n + ",");
            // Recursive call
            printNumbersRecursiveDesc2(n - 1);
        }
    }

    static void printNumbersRecursiveDesc3(int n) {
        if (n <= 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + ",");
        // Recursive call
        printNumbersRecursiveDesc3(n - 1);
    }
}
