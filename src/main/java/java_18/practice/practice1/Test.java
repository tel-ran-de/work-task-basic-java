package java_18.practice.practice1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car(2.3, "BMW");
        cars[1] = new Car(1.2, "Audi");
        cars[2] = new Car(10.2, "Tesla");
        cars[3] = new Car(3.2, "Audi");
        cars[4] = new Car(5.0, "Nissan");

        System.out.println(Arrays.toString(cars));

        Utils.bubbleSortByPrice(cars);
        System.out.println(Arrays.toString(cars));

        Utils.bubbleSortByModel(cars);
        System.out.println(Arrays.toString(cars));
    }
}
