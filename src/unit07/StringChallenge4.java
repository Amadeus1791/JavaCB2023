package unit07;

public class StringChallenge4 {
    public static void main(String[] args) {
        System.out.println(removeVowels2("hello world"));
    }

    // "hello World" ==> "hll Wrld"
    static String removeVowels(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o' && currentChar != 'u') {
                newString += " ";
            }
        }
        return newString;
    }

    static String removeVowels2(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                newString += " ";
            } else {
                newString += currentChar;
            }
        }
        return newString;
    }
}
