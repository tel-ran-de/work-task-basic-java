package java_17.tasks;

import java.util.Arrays;

public class Task3 {
    // copyOf, toString, sort, copyRange

    public static void main(String[] args) {
        // initializing an array original
        int[] arr1 = {1, 2, 3};

        System.out.println("Original Array");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // copying array org to copy
        int[] copy = Arrays.copyOf(arr1, 5);

        // Changing some elements of copy
        copy[3] = 11;
        copy[4] = 55;

        System.out.println("New array copy after modifications:");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }


        //
        int[] arr2 = {12, 13, 14, 15, 16, 17, 18};

        // to index is within the range
        int[] copy2 = Arrays.copyOfRange(arr2, 2, 6);
        for (int i = 0; i < copy2.length; i++) {
            System.out.print(i + "  ");
        }

        System.out.println();
        // to index is out of range
        // It assigns Zero to all the index out of range
        int[] copy3 = Arrays.copyOfRange(arr2, 4, arr2.length + 3);

        for (int i = 0; i < copy3.length; i++)
            System.out.print(i + "  ");

        // It throws IllegalArgumentException
        // int[] copy3 = Arrays.copyOfRange(arr, 5, 3);

        // It throws ArrayIndexOutOfBoundsException
        // int[] copy3 = Arrays.copyOfRange(arr, 10, arr.length + 5);

        //
        // Let us create different types of arrays and
        // print their contents using Arrays.toString()
        boolean[] boolArr = new boolean[]{true, true, false, true};
        byte[] byteArr = new byte[]{10, 20, 30};
        char[] charArr = new char[]{'t', 'e', 'l', 'r', 'a', 'n'};
        double[] dblArr = new double[]{1, 2, 3, 4};
        float[] floatArr = new float[]{1, 2, 3, 4};
        int[] intArr = new int[]{1, 2, 3, 4};
        long[] longArr = new long[]{1, 2, 3, 4};
        Object[] objArr = new Object[]{1, 2, 3, 4};
        short[] shortArr = new short[]{1, 2, 3, 4};

        System.out.println(Arrays.toString(boolArr));
        System.out.println(Arrays.toString(byteArr));
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(dblArr));
        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(longArr));
        System.out.println(Arrays.toString(objArr));
        System.out.println(Arrays.toString(shortArr));
    }
}
