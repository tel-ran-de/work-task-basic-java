package java_6.practice;

import java.util.Scanner;

public class Converter {

    Scanner sc = new Scanner(System.in);
    long number;
    int numberSystem;
    int numberSystemNumber;

    public void convertNumber() {
        System.out.println("В какой системе счисления число?");
        numberSystemNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Введите число: ");
        number = Long.parseLong(sc.nextLine(), numberSystemNumber);
        System.out.println("Введите систему счисления: ");
        numberSystem = sc.nextInt();
        System.out.println("Полученое число " + Long.toString(number, numberSystem));
    }
}
