package unit15.ex3WithAbstractClasses;

public class Main {
    public static void main(String[] args) {
        Orange o = new Orange(0.9);
        Apple a = new Apple(0.5);
        Cow cow = new Cow("cow");
        Chicken chicken = new Chicken("chicken");



        Animal[] edibles = { cow, chicken};
        for (Animal edible : edibles) {
            System.out.println(edible.makeSound());
        }
     /*   for (Edible edible : edibles) {
            System.out.println(edible.howToEat());

        }*/
    }
}
