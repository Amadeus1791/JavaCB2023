package unit02;

public class Divide2 {
    public static void main(String[] args) {
        int enumerator = 8;
        int denominator = 0;
        int result;
        if (denominator != 0) {
           result = enumerator / denominator;
            System.out.println("result = " + result);
        } else {  // demoniator == 0
            System.out.println("sorry, you cannot divide by 0!");
            result = -1;
            System.out.println(result);
        }
        System.out.println("DONE");

        // double, int
        // a
        // b
        // result
        // a/b ==> 2/1, 2/0,-1/-10
        // print result
        // b=0

    }
}
