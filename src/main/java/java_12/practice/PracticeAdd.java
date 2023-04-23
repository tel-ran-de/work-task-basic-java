package java_12.practice;

import java.util.Scanner;

public class PracticeAdd {
    public static void main(String[] args) {
        int a;
        int c = 0;
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            a = scn.nextInt();
            while (a != 0) {
                c = c + a % 10;
                a /= 10;
            }

            System.out.println("Сумма всех чисел введенного числа равна " + c);
        } else System.out.println("Ошибка. Вы ввели не число!");
    }
}
