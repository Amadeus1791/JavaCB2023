package unit15.ex2;

public class Orange extends Fruit implements Edible{
    public Orange(double price) {
        super(price);
    }

    @Override
    public String howToEat() {
        return "make some orange juice";
    }
}
