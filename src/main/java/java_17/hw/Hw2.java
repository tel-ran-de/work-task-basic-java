package java_17.hw;

import java.util.Arrays;
import java.util.Random;

public class Hw2 {
    /*
    Создайте массив из 8 случайных целых чисел из интервала [1;50]
    Выведите массив на консоль в строку
    Замените каждый элемент с нечетным индексом на ноль
    Снова выведете массив на консоль в отдельной строке
     */

    public static void main(String[] args) {
        int[] arr = new int[8];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(50);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
