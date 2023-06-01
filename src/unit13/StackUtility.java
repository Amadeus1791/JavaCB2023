package unit13;

public class StackUtility {
    private CharacterStack stack;

    public StackUtility(CharacterStack stack) {
        this.stack = stack;

    }

    public String reverseString(String input) {
        String newString = "";
        for (int i = 0; i < input.length(); i++) {  //JAVA --> length = 4
            stack.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            newString += stack.pop();
        }
        return newString;
    }

    public boolean isPalindrome(String input) {
        int i = 0;
        while (i < input.length() / 2) {
            stack.push(input.charAt(i));
            i++;
        } // i >= input.length()
        if (input.length() % 2 == 1) {
            i++;
        }

        while (i < input.length()) {
            char charFromStack = stack.pop();
            if (charFromStack != input.charAt(i)) {
                return false;
            }
            i++;
        }
        // i >= input.length
        return true;
    }

    public boolean checkParenthesis(String input) {
        // iterate over string

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '(') {
                stack.push(currentChar);
            } else if (currentChar == ')' && !stack.isEmpty()) {
                stack.pop();
            } else if (currentChar == ')' && stack.isEmpty()) {
                return false;
            }
        }
        return stack.isEmpty();

    }

}
