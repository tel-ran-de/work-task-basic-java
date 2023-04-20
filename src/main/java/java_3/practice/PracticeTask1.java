package java_3.practice;

import java.util.Scanner;

public class PracticeTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne / numberTwo);
    }
}
