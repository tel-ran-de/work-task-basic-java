package java_17.tasks;

public class Task1 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arr[1]);
        System.out.println(arr[arr.length - 1]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
