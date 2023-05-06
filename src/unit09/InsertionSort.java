package unit09;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {52, 63, 7, 13, 83, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueToInsert = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > valueToInsert) {
                //shift
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = valueToInsert;
        }
    }
}
