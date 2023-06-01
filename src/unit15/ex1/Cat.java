package unit15.ex1;

public class Cat extends Animal implements Sound, Movable{
    private final String furColor;

    public Cat(String species, int age, String furColor) {
        super(species, age);
        this.furColor = furColor;
    }

/*    @Override
    void eat() {
        System.out.println("eat a mouse");
    }*/

    @Override
    public String makeSound() {
        return "miau";
    }


    @Override
    public void move() {
        System.out.println("cat is moving...");
    }
}
