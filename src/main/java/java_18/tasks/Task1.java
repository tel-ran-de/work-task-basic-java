package java_18.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 6;
        int[] arr = new int[size];
        int count = 0;
        while (count < size) {
            arr[count] = scanner.nextInt();
            count++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Key - ");
        int key = scanner.nextInt();
        int result = linearSearch(arr, key);

        if (result != -1) {
            System.out.println("The element's index is = " + result);
        } else {
            System.out.println("The element is not found");
        }

    }

    public static int linearSearch(int[] arr, int element) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == element) {
                return index;
            }
        }
        return -1;
    }
}
