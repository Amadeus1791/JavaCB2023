package unit15.ex3WithAbstractClasses;

public class Orange extends Fruit implements Edible {
    public Orange(double price) {
        super(price);
    }

    @Override
    public String howToEat() {
        return "make some orange juice";
    }
}
