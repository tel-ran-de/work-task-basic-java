package java_17.practice;

import java.util.Random;

public class Pracitce2 {
    public static void main(String[] args) {
        int b = 0;
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(10);
            System.out.print(arr[i] + " ");
            if (arr[i] > 0 & arr[i] % 2 == 0) b++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве " + b + " четных");
    }
}
