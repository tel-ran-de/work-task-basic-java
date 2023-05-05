package java_22.practice.practice2;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int setSize = 5;  // Number of lucky numbers in the set.
        int range = 50;   // Assume selecting integers between 1 and range.
        int lucky;        // Holds a lucky number candidate.
        int luckyCount = 1;   // Holds count of lucky numbers in a set.
        int lucky1 = 0;   // Lucky numbers for the set of 5.
        int lucky2 = 0;
        int lucky3 = 0;
        int lucky4 = 0;
        int lucky5 = 0;
        int userNum1;     // User numbers for the set of 5.
        int userNum2;
        int userNum3;
        int userNum4;
        int userNum5;

        Scanner scanner = new Scanner(System.in);
        userNum1 = scanner.nextInt();
        userNum2 = scanner.nextInt();
        userNum3 = scanner.nextInt();
        userNum4 = scanner.nextInt();
        userNum5 = scanner.nextInt();

        while (luckyCount <= setSize) {
            lucky = (int) (1 + Math.random() * ((range - 1) + 1));  // Generate a lucky number between 1 and 50 and add 1:
            switch (luckyCount) {
                case 1 -> {
                    lucky1 = lucky;
                    luckyCount++;
                }
                case 2 -> {
                    if (lucky != lucky1) {
                        lucky2 = lucky;
                        luckyCount++;
                    }
                }
                case 3 -> {
                    if (lucky != lucky1 && lucky != lucky2) {
                        lucky3 = lucky;
                        luckyCount++;
                    }
                }
                case 4 -> {
                    if (lucky != lucky1 && lucky != lucky2 && lucky != lucky3) {
                        lucky4 = lucky;
                        luckyCount++;
                    }
                }
                case 5 -> {
                    if (lucky != lucky1 && lucky != lucky2 && lucky != lucky3 && lucky != lucky4) {
                        lucky5 = lucky;
                        luckyCount++;
                    }
                }
            }
        }
        System.out.print("Lucky numbers: " + lucky1 + " " + lucky2 + " " + lucky3 + " " + lucky4 + " " + lucky5);
        System.out.println();
        System.out.print("User numbers: " + userNum1 + " " + userNum2 + " " + userNum3 + " " + userNum4 + " " + userNum5);
    }
}
