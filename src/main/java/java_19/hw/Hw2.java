package java_19.hw;

import java.util.Arrays;

public class Hw2 {
    public static void main(String[] args) {
        /*
        Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.

        input:
        arr[] = {1,2,3,5}
        out: 4

        arr[] = {6,1,2,8,3,4,7,10,5}
        out: 9
         */

        int[] arr = {1, 2, 3, 5};
        int sum = 0;
        int result = 0;

        Arrays.sort(arr); // сортируем массив

        for (int i = 0; i <= arr[arr.length - 1]; i++) {
            sum += i; // сумма всех чисел 1+2+3+4+5
        }

        for (int i = 0; i < arr.length; i++) {
            result += arr[i]; // сумма в массиве 1+2+3+5
        }

        System.out.println(sum - result); // разница вычисляет недостающий
    }
}
