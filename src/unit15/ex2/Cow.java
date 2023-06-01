package unit15.ex2;

public class Cow extends Animal implements Edible{
    public Cow(String species) {
        super(species);
    }

    @Override
    public String howToEat() {
        return "make some steak";
    }
}
