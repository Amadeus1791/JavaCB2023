package unit10.classIntro2;

public class Car {
    String brand;
    String model;
    int horsePower;
    String color;
    int year;

        public Car(String brand, String model, int horsePower, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.color = color;
        this.year = year;
    }


    public Car(String brand, String model, int horsePower, int year) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.year = year;
        color = "black";
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
        this.brand = "VW";
        this.horsePower = 150;
        this.model = "Golf";
    }

    public Car() {

    }



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
