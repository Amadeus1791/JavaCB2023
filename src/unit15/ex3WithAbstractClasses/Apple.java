package unit15.ex3WithAbstractClasses;

public class Apple extends Fruit implements Edible {
    public Apple(double price) {
        super(price);
    }

    @Override
    public String howToEat() {
        return "make some Apfelstrudel";
    }
}
