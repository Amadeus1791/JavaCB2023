package unit03;

import java.util.Scanner;

public class TossCoin {
    public static void main(String[] args) {
        // how many tosses? 5
        // 1. Toss: HEAD
        // 2. Toss: TAIL
        // 3. Toss: TAIL
        // 4. Toss: TAIL
        // 5. Toss: HEAD

        // you had 3 tails and 2 heads

        // WHAT DATA TYPES:
        // double rand;
        // int numberOfTosses;

        // ALGO:

        // INPUT = number of tosses
        // WHILE loop

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tosses?");
        int numberOfTosses = scanner.nextInt();
        int counter = 1;
        int numberOfHeads = 0;
        int numberOfTails = 0;
        while (numberOfTosses > 0) {
            double rand = Math.random();
            if (rand > 0.5) {
                System.out.println("Toss " + counter + " : TAIL");
                numberOfTails++;
            } else {
                System.out.println("Toss " + counter + " : HEAD");
                numberOfHeads++;
            }
            counter++;
            numberOfTosses--;
        }
        // 0.0 < rand < 1
        // >0.5 ==> TAIL
        // ELSE ==> HEAD
        System.out.println("number of heads: " + numberOfHeads);
        System.out.println("number of tails: " + numberOfTails);
    }

}
