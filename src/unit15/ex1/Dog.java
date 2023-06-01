package unit15.ex1;

public class Dog extends Animal implements Sound,Movable {
    private String owner;

    public Dog(String species, int age, String owner) {
        super(species, age);
        this.owner = owner;
    }

    @Override
    void eat() {
        System.out.println("dog is eating a bone");
    }

    @Override
    public String makeSound() {
        return "woof";
    }

    @Override
    public void move() {
        System.out.println("dog is moving ...");
    }
}
