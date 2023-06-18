package unit18.myexceptions;

import java.util.Scanner;

public class NullPointer {
    public static void main(String[] args) {
      //  MyPerson p = new MyPerson();

        int num;

        System.out.println("hello world");
       // System.out.println(num);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something: ");
       // scanner.close();
        //String myInput = scanner.nextLine();
        int myInput = scanner.nextInt();
        System.out.println("your input is: "+ myInput);

       // int result = 10 / 0;
       String nullpointer = null;
        System.out.println(nullpointer.length());

    }

}
