package java_24.practice.practice1;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static final char PLUS_SIGN = '+';
    public static final char MINUS_SIGN = '-';
    public static final char MULTIPLY_SIGN = '*';
    public static final char DIVIDE_SIGN = '/';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("Введите количество аргументов (2 и более): ");
        int argumentsNumber = scanner.nextInt();
        System.out.println();
        if(argumentsNumber < 2) {
            System.out.println("Введено не верное кол-во аргументов. Кол-во аргументов должно быть 2 и более");
            System.exit(0); // Завершение работы программы
        }

        double[] arguments = new double[argumentsNumber];
        for (int i = 0; i < arguments.length; i++) {
            System.out.print(String.format("Введите значение %d аргумента: ", i));
            arguments[i] = scanner.nextDouble();
            System.out.println();
        }

        System.out.print("Введите знак математической операции (+, -, *, /): ");
        String signString = scanner.next();
        char sign = signString.charAt(0);
        System.out.println();

        double result = arguments[0]; // Объявление переменной для хранения результата вычислений и инициализируем её значением первого аргумента

        for (int i = 1; i < arguments.length; i++) { // Начинаем выполнять математические выражения над каждым из последующих аргументов, начиная со второго
            double argument = arguments[i];
            switch (sign) { // Выполнение математической операции в зависимости от введенного знака
                case PLUS_SIGN -> // Если пользователь ввёл знак + ...
                        result += argument; // ... выполняется операция сложения значения очередного аргумента с общим результатом
                case MINUS_SIGN -> // Если пользователь ввёл знак - ...
                        result -= argument; // ... выполняется операция вычитания значения очередного аргумента с общим результатом
                case MULTIPLY_SIGN -> // Если пользователь ввёл знак * ...
                        result *= argument; // ... выполняется операция умножения значения очередного аргумента с общим результатом
                case DIVIDE_SIGN -> // Если пользователь ввёл знак / ...
                        result /= argument; // ... выполняется операция деления значения очередного аргумента с общим результатом
                default -> {
                    System.out.println(String.format("Знак математической операции '%s' программой не поддерживается", sign));
                    System.exit(0); // Завершение работы программы
                }
            }
        }

        StringBuilder resultMessage = new StringBuilder();
        for (int i = 0; i < arguments.length; i++) { // Добавляем в строку ответа значение каждого аргумента
            double argument = arguments[i];
            resultMessage.append(String.format("%.2f", argument)); // Ограничиваем значение аргумента при выводе на экран до двух цифр после запятой
            if (i < arguments.length - 1) resultMessage.append(sign); // Выводим знак математической операции после каждого аргумента, кроме последнего
        }
        resultMessage.append("="); // Добавляем в строку ответа значение результата вычислений
        resultMessage.append(String.format("%.2f", result)); // Ограничиваем значение результата при выводе на экран до двух цифр после запятой

        System.out.println(resultMessage);
    }
}
