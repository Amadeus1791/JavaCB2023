package unit04;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] numberCollection = new int[10];
        System.out.println(Arrays.toString(numberCollection));
        numberCollection[0] = 0;
        numberCollection[1] = 1;
        numberCollection[2] = 2;
        numberCollection[3] = 3;
        numberCollection[4] = 4;
        numberCollection[5] = 5;
        numberCollection[6] = 6;
        numberCollection[7] = 7;
        numberCollection[8] = 8;
        numberCollection[9] = 9;
        //System.out.println(Arrays.toString(numberCollection));

   /*     for (int i = 0; i < numberCollection.length; i++) {
            System.out.println(numberCollection[i]);
        }*/

        // 1. new array with length 10
        // 2. fill array with elements 0-9

   /*     int[] arr = new int[10]; //[0,0,0,0,0,0,0,0,0]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }*/

        int[] arr3 = new int[3000];
        arr3[0]=1;
        arr3[1]=2;
        arr3[2]=3;
        arr3[2999]=9;
        int sum = 0;
        // LOOP
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
            int value = arr3[i];
            sum = sum + value;
            //sum += arr3[i];
        }
        System.out.println(sum);

    //    [1,2,3] --> 6
     //   [4,7,3,0] -> 14


        // [1,2,3] --> [2,3,4]


    }
}
