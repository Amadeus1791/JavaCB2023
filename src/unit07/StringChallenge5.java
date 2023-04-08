package unit07;

public class StringChallenge5 {
    public static void main(String[] args) {
        String[] arr = {"Java", "C++", "Zebra"};
        System.out.println(getLexicographicLargestString(arr));
    }

    // {"Java" , "C++", "Zebra"} ==> "Zebra"
    static String getLexicographicLargestString(String[] arr) {
        String max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}
