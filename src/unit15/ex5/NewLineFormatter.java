package unit15.ex5;

public class NewLineFormatter implements Formatter{
    @Override
    public String format(String input) {
        String newString = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                newString += "\n";
            }
            newString += input.charAt(i);
        }
        return newString;
    }
}
