package unit07;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "BMW3"; //>0
        String s2 = "BMW2";
        System.out.println(s1.compareTo(s2));
        if (s1.compareTo(s2) > 0) {
            System.out.println("s1 is greater");
        } else if (s1.compareTo(s2) == 0) {
            System.out.println("s1 is equal to s2");
        } else {
            System.out.println("s2 is greater");
        }
    }
}
