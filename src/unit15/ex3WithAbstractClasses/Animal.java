package unit15.ex3WithAbstractClasses;

public abstract class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public abstract String makeSound();

    public void doNothing() {
        return;
    }
}
