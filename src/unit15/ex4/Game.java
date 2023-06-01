package unit15.ex4;

public class Game {
    private final IWriter writer;

    public Game(IWriter writer) {
        this.writer = writer;
    }

    void printWelcomeMessage() {
        writer.write("Welcome to my new game");
    /*    System.out.println("Welcome to my new game");
        System.out.println("please choose your character:");*/
    }

    void runGame() {
        printWelcomeMessage();
        //....
    }
}
