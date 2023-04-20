package java_8.practice;

import java.util.Scanner;

public class Practice {

    // 2. выбор случайного студента для вопроса
    private static int randomStudentNumber;

    public static void main(String[] args) {
        System.out.println("Enter the number of students attending the lecture: ");

        Scanner studentsValueScanner = new Scanner(System.in);

        setStudentsValue(studentsValueScanner.nextInt());

        System.out.println("Random student number is: " + randomStudentNumber);
    }

    public static void setStudentsValue(int studentsValue) {
        // [2 -> studentsValue]
        int max = studentsValue;
        int min = 2;
        // min + (int)(Math.random() * ((max - min) + 1))
        randomStudentNumber = (int) (min + Math.random() * ((max - min) + 1));
    }

    // 3. конвертер

    public static double runKelvinConverter(double baseValue) {
        return baseValue + 273.15;
    }


    public static double runFahrenheitConverter(double baseValue) {
        return 1.8 * baseValue + 32;
    }

    //  4. программа обмена

    public static void exchange() {
        int a;
        int b;
        int temp;
        System.out.println("Введите значения a и b");

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("До обмена значениями " + a + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("После обмена значениями " + a + b);
    }

    public static void exchangeWithoutThird() {
        int a;
        int b;
        System.out.println("Введите нужные значения a и b");

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("До обмена значениями " + a + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("После обмена значениями " + a + b);
    }
}
