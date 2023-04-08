package unit07;

public class MorgenChallenge {
    public static void main(String[] args) {
        // {"Java", "C++"} ==> "Java"
        String[] arr = {"Java", "C++", "Javascript","Python","Malbolge","C#"};
        String maxString = maxLength(arr);
        String maxString2 = maxSecondLength(arr);
        System.out.println(maxString);
        System.out.println(maxString2);
    }

    static String maxLength(String[] arr) {
        String max = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max.length()) {
                max = arr[i];
            }
        }
        return max;
    }

    static String maxSecondLength(String[] arr) {
        String max = "";
        String secondMax = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max.length()) {
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;
    }

    static String maxSecondLength3(String[] arr) {
        String max = "";
        String secondMax = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max.length()) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i].length() > secondMax.length()) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
