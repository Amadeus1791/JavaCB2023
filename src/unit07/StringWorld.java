package unit07;

public class StringWorld {
    public static void main(String[] args) {
        String myString = "Hello";
        int length = myString.length();
        //System.out.println(myString.toUpperCase());
        // System.out.println(myString.charAt(myString.length()-1));
  /*      for (int i = 0; i < myString.length(); i++) {
            System.out.print(myString.charAt(i));
        }*/

      /*  System.out.println(toNormalString("Wolfgang"));
        System.out.println(toReverseString("Wolfgang"));
        System.out.println(onlyEverySecondChar("Codersbay"));
        System.out.println(firstAndLastChar("Codersbay"));*/
        // reverse("Wolfgang") ==> "gnagfloW"

        char c = 56;
        char d = 57;
        System.out.println(c);
        System.out.println(d);
        char c2 = 'a';
        int number = c2;
        System.out.println((int) c2);

    }

    static String toNormalString(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            newString += s.charAt(i);
        }
        return newString;
    }


    static String toReverseString(String s) {
        String newString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newString += s.charAt(i);
        }
        return newString;
    }

    // TODO 2 "Codersbay" ==> "Cdrby"
    static String onlyEverySecondChar(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i += 2) {
            newString += s.charAt(i);
        }
        return newString;
    }

    // TODO: "Codersbay" ==> "Cy"
    static String firstAndLastChar(String s) {
        String newString = "";
        newString += s.charAt(0);
        newString += s.charAt(s.length() - 1);
        return newString;
    }

    //TODO: "Java" ==> "JJaavvaa"
    String doubleChars(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
  /*          for (int j = 0; j < 2; j++) {
                newString += s.charAt(i);
            }*/
            newString += s.charAt(i);
            newString += s.charAt(i);
        }
        return newString;
    }





}
