package unit15.ex3WithAbstractClasses;

public class Dog extends Animal {
    public Dog(String species) {
        super(species);
    }

    @Override
    public String makeSound() {
        return null;
    }

}
