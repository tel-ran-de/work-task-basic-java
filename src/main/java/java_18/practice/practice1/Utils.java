package java_18.practice.practice1;

public class Utils {
    public static void bubbleSortByPrice(Car[] cars) {
        boolean sorted = false;
        Car temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < cars.length - 1; i++) {
                if (cars[i].getPrice() > cars[i + 1].getPrice()) {
                    temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void bubbleSortByModel(Car[] cars) {
        boolean sorted = false;
        Car temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < cars.length - 1; i++) {
                if (cars[i].getModel().charAt(0) > cars[i + 1].getModel().charAt(0)) {
                    temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
