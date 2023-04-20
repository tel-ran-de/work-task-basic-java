package java_7.practice;

import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperBound = 25;
        // generate random values from 0-24
        int intRandom = rand.nextInt(upperBound);
        double doubleRandom = rand.nextDouble();
        float floatRandom = rand.nextFloat();

        System.out.println("Random integer value from 0 to" + (upperBound - 1) + " : " + intRandom);
        System.out.println("Random float value between 0.0 and 1.0 : " + floatRandom);
        System.out.println("Random double value between 0.0 and 1.0 : " + doubleRandom);
    }

    public static void generateNumber() {
        int min = 50;
        int max = 100;

        //Generate random int value from 50 to 100
        System.out.println("Random value in int from " + min + " to " + max + ":");
        int randomInt = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(randomInt);
    }

}
