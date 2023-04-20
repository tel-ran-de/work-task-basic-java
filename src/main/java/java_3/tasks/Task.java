package java_3.tasks;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int number = scanner.nextInt();
        boolean isTrue = scanner.nextBoolean();
        long longNum = scanner.nextLong();
        double doubleNum = scanner.nextDouble();

        System.out.println("String " + str);
        System.out.println("Integer " + number);
        System.out.println("Boolean " + isTrue);
        System.out.println("Long " + longNum);
        System.out.println("Double " + doubleNum);
    }
}
