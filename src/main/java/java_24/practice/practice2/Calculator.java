package java_24.practice.practice2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static final char PLUS_SIGN = '+';
    public static final char MINUS_SIGN = '-';
    public static final char MULTIPLY_SIGN = '*';
    public static final char DIVIDE_SIGN = '/';

    public static final int HISTORY_SIZE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String[] resultsHistory = new String[HISTORY_SIZE]; // Массив для запоминания истории 5 последних вычислений

        do {
            System.out.print("Введите количество аргументов (2 и более): ");
            int argumentsNumber = scanner.nextInt();
            System.out.println();
            if (argumentsNumber < 2) {
                System.out.println("Введено не верное кол-во аргументов. Кол-во аргументов должно быть 2 и более");
                System.exit(0); // Завершение работы программы
            }

            double[] arguments = new double[argumentsNumber]; // Массив для хранения аргументов
            char[] signs = new char[argumentsNumber - 1]; // Массив для хранения знаков математических операций
            for (int i = 0; i < arguments.length; i++) {
                System.out.print(String.format("Введите значение %d аргумента: ", i + 1));
                arguments[i] = scanner.nextDouble();
                System.out.println();

                if (i < arguments.length - 1) { // Ввод знаков математической операции для аргументов с первого до предпоследнего
                    System.out.print("Введите знак математической операции (+, -, *, /): ");
                    signs[i] = scanner.next().charAt(0); // Сохранение введенного знака в массив знаков операций
                    System.out.println();
                }
            }

            double result = arguments[0]; // Объявление переменной для хранения результата вычислений и инициализируем её значением первого аргумента

            for (int i = 1; i < arguments.length; i++) { // Начинаем выполнять математические выражения над каждым из последующих аргументов, начиная со второго
                double argument = arguments[i];
                switch (signs[i - 1]) { // Выполнение математической операции, введенной пользователем
                    case PLUS_SIGN -> // Если пользователь ввёл знак + ...
                            result += argument; // ... выполняется операция сложения значения очередного аргумента с общим результатом
                    case MINUS_SIGN -> // Если пользователь ввёл знак - ...
                            result -= argument; // ... выполняется операция вычитания значения очередного аргумента с общим результатом
                    case MULTIPLY_SIGN -> // Если пользователь ввёл знак * ...
                            result *= argument; // ... выполняется операция умножения значения очередного аргумента с общим результатом
                    case DIVIDE_SIGN -> // Если пользователь ввёл знак / ...
                            result /= argument; // ... выполняется операция деления значения очередного аргумента с общим результатом
                    default -> {
                        System.out.println(String.format("Знак математической операции '%s' программой не поддерживается", signs[i - 1]));
                        System.exit(0); // Завершение работы программы
                    }
                }
            }

            StringBuilder resultMessage = new StringBuilder();
            for (int i = 0; i < arguments.length; i++) { // Добавляем в строку ответа значение каждого аргумента
                double argument = arguments[i];
                resultMessage.append(String.format("%.2f", argument)); // Ограничиваем значение аргумента при выводе на экран до двух цифр после запятой
                if (i < arguments.length - 1)
                    resultMessage.append(signs[i]); // Выводим знак математической операции после каждого аргумента, кроме последнего
            }
            resultMessage.append("="); // Добавляем в строку ответа значение результата вычислений
            resultMessage.append(String.format("%.2f", result)); // Ограничиваем значение результата при выводе на экран до двух цифр после запятой

            System.out.println(resultMessage); // Вывод последнего результата работы программы
            System.out.println();

            // Освобождаем первую ячейку массива для сохранения последнего результата работы программы, сдвигая значения на 1 ячейку вперёд, начиная с конца
            for (int i = resultsHistory.length - 1; i > 0; i--) {
                resultsHistory[i] = resultsHistory[i - 1];
            }

            resultsHistory[0] = resultMessage.toString();

            System.out.println("История выполненных вычислений:");
            System.out.println(Arrays.toString(resultsHistory));
            System.out.println();

            System.out.println("Выполнить еще одно вычисление? (Y/N):");
            String needNextCalculation = scanner.next(); // Получение введенного значения - требуется ли калькулятору выполнить еще одно вычисление
            if (!"Y".equalsIgnoreCase(needNextCalculation)) {
                System.exit(0); // Завершение работы программы
            }
        } while (true);
    }
}
