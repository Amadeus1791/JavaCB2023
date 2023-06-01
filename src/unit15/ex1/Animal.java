package unit15.ex1;

public class Animal implements Sound{
    private final String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    void eat() {
        System.out.println("standard eat");
    }

    @Override
    public String makeSound() {
        return "standard sound";
    }
}
