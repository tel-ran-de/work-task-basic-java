package java_23.practice.practice3;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    // Объявление повторно используемых констант
    public static final char PLUS_SIGN = '+';
    public static final char MINUS_SIGN = '-';
    public static final char MULTIPLY_SIGN = '*';
    public static final char DIVIDE_SIGN = '/';
    public static final String ANSWER_YES = "Y"; // Значение ответа пользователя, если он решил выполнить еще одну математическую операцию
    public static final String ANSWER_NO = "N"; // Значение ответа пользователя, если требуется завершить работу программы

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // Установка английского формата ввода чисел с разделение целой и дробной частей точкой

        String needNextCalculation; // Переменная для хранения введенного пользователем значения - требуется ли калькулятору выполнить еще одно вычисление

        do {
            System.out.println("Введите значение первого аргумента (разделитель целой и дробной части - точка):");
            double argumentOne = scanner.nextDouble(); // Объявление переменной первого аргумента и ввод её значения с клавиатуры

            char sign; // Переменная для хранения введенного пользователем знака математической операции
            do {
                System.out.println("Введите знак математической операции (+, -, *, /):");
                String signString = scanner.next(); // Получение введенного значения в формате строки
                sign = signString.charAt(0); // Получение первого символа строки
            } while (sign != PLUS_SIGN && sign != MINUS_SIGN && sign != MULTIPLY_SIGN && sign != DIVIDE_SIGN);

            double argumentTwo; // Объявление переменной второго аргумента
            do {
                System.out.println("Введите значение второго аргумента (разделитель целой и дробной части - точка, не должен быть равен 0):");
                argumentTwo = scanner.nextDouble(); // Ввод значения переменной второго аргумента с клавиатуры
            } while (sign == DIVIDE_SIGN && argumentTwo == 0);

            double result = 0; // Объявление переменной для хранения результата вычислений

            switch (sign) { // Выполнение математической операции в зависимости от введенного знака
                case PLUS_SIGN: // Если пользователь ввёл знак + ...
                    result = argumentOne + argumentTwo; // ... выполняется операция сложения
                    break;
                case MINUS_SIGN: // Если пользователь ввёл знак - ...
                    result = argumentOne - argumentTwo; // ... выполняется операция вычитания
                    break;
                case MULTIPLY_SIGN: // Если пользователь ввёл знак * ...
                    result = argumentOne * argumentTwo; // ... выполняется операция умножения
                    break;
                case DIVIDE_SIGN: // Если пользователь ввёл знак / ...
                    result = argumentOne / argumentTwo; // ... выполняется операция деления
                    break;
            }

            System.out.println(String.format("%.2f %s %.2f = %.2f", argumentOne, sign, argumentTwo, result)); // Вывод значений аргументов и полученного результата на экран

            do {
                System.out.println("Выполнить еще одно вычисление? (Y/N):");
                needNextCalculation = scanner.next(); // Получение введенного значения - требуется ли калькулятору выполнить еще одно вычисление
            } while (!ANSWER_YES.equalsIgnoreCase(needNextCalculation) && !ANSWER_NO.equalsIgnoreCase(needNextCalculation)); // Программа запрашивает ввод значения до тех пор, пока не будет введено одно из двух ожидаемых значений

        } while (ANSWER_YES.equalsIgnoreCase(needNextCalculation));
    }
}
