package unit05;

import java.util.Arrays;

public class ArrayExc1 {
    public static void main(String[] args) {
        // new string array
        // fill array with different car brands
        String[] cars = new String[5];
        cars[0] = "BMW";
        cars[1] = "Audi";
        cars[2] = "Bentley";
        cars[3] = "Mercedes";
        cars[4] = "";
        System.out.println(cars[4]);
        System.out.println(Arrays.toString(cars));

        for (int i = 0; i < cars.length; i++) {
            String currentCar = cars[i];
            if (currentCar.startsWith("B")) {
                cars[i] = currentCar.toUpperCase();
                System.out.println(currentCar);
            }

    /*        if (cars[i].startsWith("B")) {
                System.out.println(cars[i]);
            }*/
        }
        System.out.println(Arrays.toString(cars));
        String[] cheaperCars = {"Volvo", "Dacia", "Skoda", "Fiat", ""};
        System.out.println(cheaperCars[4]);


    }
}
