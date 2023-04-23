package java_9.practice;

public class PracticeAdd {
    // Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.

    public static void main(String[] args) {
        double n = 8.5;
        double m = 11.45;
        int a = 10;
        double b = Math.abs(a - n);
        double c = Math.abs(a - m);
        if (b == c) {
            System.out.println("Числа " + n + " и " + m + " равноудалены от " + a);
        }
        if (b > c) {
            System.out.println("Число " + m + " ближе к " + a);
        }
        if (b < c) {
            System.out.println("Число " + n + " ближе к " + a);
        }
    }
}
