package unit13;

public class Main {
    public static void main(String[] args) {
        CharacterStack cs = new CharacterStack(100);
 /*       cs.push('a');
        cs.push('b');
        cs.push('c');
        System.out.println(cs);
        cs.pop();
        cs.pop();
        cs.pop();
        System.out.println(cs);*/

        // Stack Utility
        StackUtility stackUtility = new StackUtility(cs);
  /*      System.out.println(stackUtility.reverseString("JAVA"));
        System.out.println(stackUtility.isPalindrome("ANNA"));
        System.out.println(stackUtility.isPalindrome("ANYA"));
        System.out.println(stackUtility.isPalindrome("ANTNA"));
        System.out.println(stackUtility.isPalindrome("RENTNER"));*/
        System.out.println(stackUtility.checkParenthesis(")((()))"));
        System.out.println(stackUtility.checkParenthesis(")()"));
        System.out.println(stackUtility.checkParenthesis("((()))"));
    }
}
