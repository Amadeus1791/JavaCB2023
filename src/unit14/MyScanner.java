package unit14;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in your magic num");
        int magicNum = scanner.nextInt();
        System.out.println(magicNum);
    }
}
