package unit15.ex3WithAbstractClasses;

public class Cow extends Animal implements Edible {
    public Cow(String species) {
        super(species);
    }

    @Override
    public String makeSound() {
        return "muuh";
    }

    @Override
    public String howToEat() {
        return "make some steak";
    }


}
