package unit15.ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileWriter implements IWriter {
    File file = new File("game.txt");
    PrintStream printStream = new PrintStream(file);


    public FileWriter() throws FileNotFoundException {
    }

    @Override
    public void write(String input) {
        System.setOut(printStream);
        System.out.println(input);
    }

}
