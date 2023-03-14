package unit03;

public class WhileStatement {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
        System.out.println();

        for (int myNumber = 1; myNumber <= 10; myNumber++) {
            System.out.println(myNumber);
        }

        int limit = 100000000;
        // 0 is an even number
        // 1 is an odd number
        // 2 is an even number
        // ...
//        while (number <= limit) {
//            if (number % 2 == 0) {
//                System.out.println(number + " is an even number");
//            } else {
//                System.out.println(number + " is an odd number");
//            }
//            number = number + 1;
//        }
        for (int number = 0; number <= limit; number++) {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number");
            } else {
                System.out.println(number + " is an odd number");
            }
        }


    }
}
