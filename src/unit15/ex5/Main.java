package unit15.ex5;

public class Main {
    public static void main(String[] args) {
        UpperCaseFormatter upperCaseFormatter = new UpperCaseFormatter();
        NewLineFormatter newLineFormatter = new NewLineFormatter();
        Game game = new Game(newLineFormatter);
        game.runGame();
        //implementation 1: WELCOME TO MY GAME
        //implementation 2: WELCOME
        // TO
        // MY
        // GAME
        // implementation 3: welcome to my game
    }
}
