package unit07;

public class StringChallenge3 {
    public static void main(String[] args) {
        embellishText("Java is cool");
    }

    // "Java is cool" ==> PRINT: "J_a_v_a_ _i_s_ _c_o_o_l"
    static void embellishText(String s) {
        System.out.print(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            System.out.print("_"+s.charAt(i));
        }
    }
}
