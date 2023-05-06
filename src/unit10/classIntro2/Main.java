package unit10.classIntro2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","M4", 650, "black metallic", 2023);
        Car car2 = new Car();
        Car car3 = new Car("green", 2020);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


    }

}
