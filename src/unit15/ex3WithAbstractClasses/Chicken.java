package unit15.ex3WithAbstractClasses;

public class Chicken extends Animal implements Edible {
    public Chicken(String species) {
        super(species);
    }

    @Override
    public String makeSound() {
        return "kikerigi";
    }

    @Override
    public String howToEat() {
        return "make some chickenburger";
    }
}
