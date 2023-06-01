package unit15.ex4;

import java.io.PrintStream;

public class ConsoleWriter implements IWriter {
   // PrintStream printStream = new PrintStream(System.out);

    @Override
    public void write(String input) {
        System.out.println(input);
    }
}
