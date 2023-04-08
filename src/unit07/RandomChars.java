package unit07;

import java.util.Random;

public class RandomChars {
    public static void main(String[] args) {
        System.out.println(randomChars("Coderbsay"));
    }

    // { "Codersbay"} ==> "oyabsredC"
    static String randomChars(String s) {
        String newString = "";
        // 1. create checkbox data structure for remembering the numbers
        Random rand = new Random();
        int[] checkBox = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            checkBox[i] = i;
        } // [0,1,2,3,4,5,6,7]

        // 2a. choose random Number
        // 2b. check if random Number is valid
                // if YES continue
                // if NO try again to find a random number
        for (int i = 0; i < s.length(); i++) {
            int randomNumber = rand.nextInt(s.length()); // 0-8
            while (checkBox[randomNumber] == -1) {     // if -1 continue looking for random number
                randomNumber = rand.nextInt(s.length());
            }
            // cool you found a valid number = :)
            checkBox[randomNumber] = -1;
            newString += s.charAt(randomNumber);
        }


    /*
        // 2. for: assign random char to new string
        for (int i = 0; i < s.length(); i++) {


            // new random number
            //s.replace(""+s.charAt(i),"");

            newString += s.charAt(randomNumber);
        }*/
        return newString;
    }
}
