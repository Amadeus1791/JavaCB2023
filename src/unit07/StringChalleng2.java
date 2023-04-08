package unit07;

public class StringChalleng2 {
    public static void main(String[] args) {

        System.out.println(toASCIITable("Java is cool"));
    }
    // String Challenge 2
    static String toASCIITable(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            int asciiNumber = s.charAt(i);
            // newString += s.charAt(i) + " = " + (int) s.charAt(i);
        }
        return newString;
    }

    // TODO: "hello" ==> h = 68
    //e = 58
    static String toASCIITableWithEsle(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            int asciiNumber = s.charAt(i);
            if (asciiNumber == 32) {
                newString += "SPACE" + " = " + asciiNumber + "\n";
            } else {
                newString += s.charAt(i) + " = " + asciiNumber + "\n";
            }

            // newString += s.charAt(i) + " = " + (int) s.charAt(i);

        }
        return newString;
    }

    // TODO: return random order of word

}
