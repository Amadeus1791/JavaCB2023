package unit15.ex1;

public class Main {
    public static void main(String[] args) {
        Sound cat = new Cat("cat", 5, "black");
        Sound dog = new Dog("dog", 15, "me");

        Sound[] sounds = {cat, dog, new Dog("wolf", 20, "no one"), new Cat("Tigercat", 30, "organe-black"), new Animal("don't know", -1)};
        for (int i = 0; i < sounds.length; i++) {
            System.out.println(sounds[i].makeSound());
        }

    }
}
