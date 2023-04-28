package java_17.hw;

import java.util.Arrays;
import java.util.Random;

public class Hw1 {
    /*
    Создайте массив из 5 случайных целых чисел из интервала [10;99]
    Выведите его на консоль в строку.
    Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью
     */
    public static void main(String[] args) {
        boolean isIncrease = true;
        int[] arr = new int[5];

        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10,99);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] < arr[i - 1]) {
                isIncrease = false;
                break;
            }
        }
        System.out.println(isIncrease);
    }
}
