package unit15.ex2;

public class Chicken extends Animal implements Edible{
    public Chicken(String species) {
        super(species);
    }

    @Override
    public String howToEat() {
        return "make some chickenburger";
    }
}
