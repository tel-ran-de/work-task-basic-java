package java_21.tasks.task1;

import java_21.tasks.Utils;

public class Test {
    public static void main(String[] args) {
        int[] arr = Utils.getNumbers();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
