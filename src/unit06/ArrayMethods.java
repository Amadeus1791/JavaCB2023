package unit06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethods {
    public static void main(String[] args) {
        int result = plus10(2);
        System.out.println(result);
        int[] myArray = {1, 2, 3, 4, 5};
        //int[] arrResult = plus10Array(myArray);
        //System.out.println(Arrays.toString(arrResult));
        int maxResult = getMax(myArray);
        System.out.println("max= " + maxResult);
        double avg = getAverage(myArray);
        System.out.println("avg= " + avg);

        // READ ARRAY
        //double[] newArray = readArray();

        // SWITCH NUMBERS
        int[] newArray2 = switchFirstAndLast(myArray);
        System.out.println(Arrays.toString(newArray2));
    }

    // 1 ==> 11
    static int plus10(int num) {
        return num + 10;
    }

    // 1,2,3,4,5 ==> 11,12,13,14,15
    static int[] plus10Array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 10;
        }
        return arr;
    }

    // INPUT {1,2,3,4,5}
    // OUTPUT 5
    // INPUT {0,10,15,2}
    // OUTPUT 15
    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static double getAverage(int[] arr) {

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        return avg;
        // return sum / arr.length;
    }

    // {1,2,3,4,5} ==> 5
    // {3,0,-3} ====> -3
    // return arr[arr.length-1]

    static double[] readArray() {
        // prompt user
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many values?");
        int length = scanner.nextInt();
        double[] arr = new double[length];
        System.out.println("please type in your values: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("please enter number at index "+i);
            arr[i] = scanner.nextDouble();
        }
        System.out.println("Your array is: ");
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    static int[] switchFirstAndLast(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }

    // {1,2,3,4,5} ==> {2,1,4,3,5}
    // {3,6,9,3,6,0} ==> {6,3,3,9,0,6}
/*    static int[] switchPairwise(int[] arr) {

    }*/



}
