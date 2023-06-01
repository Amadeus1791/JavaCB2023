package unit15.ex2;

public class Main {
    public static void main(String[] args) {
        Orange o = new Orange(0.9);
        Apple a = new Apple(0.5);
        Cow cow = new Cow("cow");
        Chicken chicken = new Chicken("chicken");

        Edible[] edibles = {o, a, cow, chicken};
        for (Edible edible : edibles) {
            System.out.println(edible.howToEat());
        }
    }
}
