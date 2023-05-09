package java_23.practice.practice1;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // Установка английского формата ввода чисел с разделение целой и дробной частей точкой

        System.out.println("Введите значение первого аргумента (разделитель целой и дробной части - точка):");
        double argumentOne = scanner.nextDouble(); // Объявление переменной первого аргумента и ввод её значения с клавиатуры

        System.out.println("Введите знак математической операции (+, -, *, /):");
        String signString = scanner.next(); // Получение введенного значения в формате строки
        char sign = signString.charAt(0); // Получение первого символа строки
        if (sign != '+' && sign != '-' && sign != '*' && sign != '/') { // Проверка введенного с клавиатуры значения операции на вхождение в допустимый диапазон операций
            System.out.println(String.format("Знак математической операции '%s' программой не поддерживается", sign));
            System.exit(0); // Завершение работы программы
        }

        System.out.println("Введите значение второго аргумента (разделитель целой и дробной части - точка):");
        double argumentTwo = scanner.nextDouble(); // Объявление переменной второго аргумента и ввод её значения с клавиатуры

        double result = 0; // Объявление переменной для хранения результата вычислений

        if (sign == '+') { // Если пользователь ввёл знак + ...
            result = argumentOne + argumentTwo; // ... выполняется операция сложения
        } else if (sign == '-') { // Если пользователь ввёл знак - ...
            result = argumentOne - argumentTwo; // ... выполняется операция вычитания
        } else if (sign == '*') { // Если пользователь ввёл знак * ...
            result = argumentOne * argumentTwo; // ... выполняется операция умножения
        } else if (sign == '/') { // Если пользователь ввёл знак / ...
            if (argumentTwo == 0) { // ... выполняется проверка деления на 0
                System.out.println("Делитель не должен быть равен 0");
                System.exit(0); // Завершение работы программы
            } else {
                result = argumentOne / argumentTwo; // ... выполняется операция деления
            }
        }

        System.out.println(String.format("%.2f %s %.2f = %.2f", argumentOne, sign, argumentTwo, result)); // Вывод значений аргументов и полученного результата на экран
    }
}
