package java_17.practice;

import java.util.Arrays;

public class PracticeAdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};

        System.out.println("The missing number is " + getMissingNumber(arr));
    }

    public static int getMissingNumber(int[] arr) {
        // получаем длину массива
        int n = arr.length;

        // фактический размер `n+1`, так как в массиве отсутствует число
        int m = n + 1;

        // получить сумму целых чисел от 1 до `n+1`
        int total = m * (m + 1) / 2;

        // получаем реальную сумму целых чисел в массиве
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // недостающее число - это разница между ожидаемой суммой и фактическая сумма
        return total - sum;
    }

}
