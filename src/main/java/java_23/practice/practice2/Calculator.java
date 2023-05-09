package java_23.practice.practice2;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // Установка английского формата ввода чисел с разделение целой и дробной частей точкой

        System.out.println("Введите значение первого аргумента (разделитель целой и дробной части - точка):");
        double argumentOne = scanner.nextDouble(); // Объявление переменной первого аргумента и ввод её значения с клавиатуры

        System.out.println("Введите знак математической операции (+, -, *, /, %):");
        String signString = scanner.next(); // Получение введенного значения в формате строки
        char sign = signString.charAt(0); // Получение первого символа строки
        if (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '%') { // Проверка введенного с клавиатуры значения операции на вхождение в допустимый диапазон операций
            System.out.println(String.format("Знак математической операции '%s' программой не поддерживается", sign));
            System.exit(0); // Завершение работы программы
        }

        System.out.println("Введите значение второго аргумента (разделитель целой и дробной части - точка):");
        double argumentTwo = scanner.nextDouble(); // Объявление переменной второго аргумента и ввод её значения с клавиатуры
        if ((sign == '/' || sign == '%') && argumentTwo == 0) { // Если пользователь ввёл знак деления или деления по модулю, то выполняется проверка деления на 0
            System.out.println("Делитель не должен быть равен 0");
            System.exit(0); // Завершение работы программы
        }

        double result = 0; // Объявление переменной для хранения результата вычислений

        switch (sign) { // Выполнение математической операции в зависимости от введенного знака
            case '+': // Если пользователь ввёл знак + ...
                result = argumentOne + argumentTwo; // ... выполняется операция сложения
                break;
            case '-': // Если пользователь ввёл знак - ...
                result = argumentOne - argumentTwo; // ... выполняется операция вычитания
                break;
            case '*': // Если пользователь ввёл знак * ...
                result = argumentOne * argumentTwo; // ... выполняется операция умножения
                break;
            case '/': // Если пользователь ввёл знак / ...
                result = argumentOne / argumentTwo; // ... выполняется операция деления
                break;
            case '%': // Если пользователь ввёл знак % ...
                result = argumentOne % argumentTwo; // ... выполняется операция деления по модулю (получение остатка от деления)
                break;
        }

        System.out.println(String.format("%.2f %s %.2f = %.2f", argumentOne, sign, argumentTwo, result)); // Вывод значений аргументов и полученного результата на экран
    }
}
