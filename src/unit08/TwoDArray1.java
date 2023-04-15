package unit08;

import java.util.Arrays;

public class TwoDArray1 {
    public static void main(String[] args) {
        final int LENGTH = 3;
        int[][] arr = new int[LENGTH][LENGTH];
        // System.out.println(Arrays.toString(arr));
   /*     for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }*/

        int value = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("array at row " + i + " and column " + j + "" +
                        " has value: " + value);
                arr[i][j] = value++;

            }
        }

        char[][] charArr = new char[LENGTH][LENGTH];
        char charValue = 'A';
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr[i].length; j++) {
                charArr[i][j] = charValue++;
            }
        }

        char[][] charArrFast = {{'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}};

        for (int i = 0; i < charArrFast.length; i++) {
            System.out.println(Arrays.toString(charArrFast[i]));
        }

        for (int i = 0; i < charArr.length; i++) {
            System.out.print("ROW "+ i+": ");

            for (int j = 0; j < charArr[i].length; j++) {
                System.out.print(charArr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
