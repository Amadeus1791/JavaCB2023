package unit09;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 5, 9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    //1. findMaxIndex
    //2. swap maxIndex to last position
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // here I have found my minIndex
            BubbleSort.swap(arr, i,minIdx);
        }
    }
    static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }




}
