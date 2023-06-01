package unit15.ex4;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       Game game = new Game(new ConsoleWriter());
        Game game2 = new Game(new FileWriter());

       game.runGame();
    }
}
