package unit15.ex5;

import unit15.ex4.IWriter;


public class Game {
    private final Formatter formatter;

    public Game(Formatter formatter) {
        this.formatter = formatter;
    }

    void printWelcomeMessage() {
        System.out.println(formatter.format("welcome to my new game"));

        //System.out.println("WELCOME TO MY NEW GAME");


    /*    System.out.println("Welcome to my new game");
        System.out.println("please choose your character:");*/
    }

    void runGame() {
        printWelcomeMessage();
        //....
    }
}

