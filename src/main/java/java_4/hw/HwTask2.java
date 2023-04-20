package java_4.hw;

public class HwTask2 {
    public static void main(String[] args) {
//        Создайте методы с математическими операциями +, -, *, / (addition, subtraction, multiplication, division)
//        Каждый метод принимает два числа в параметрах и возвращает результат
//        Вызовите все методы в main

        System.out.println(getAddition(4, 6));
        System.out.println(getSubtraction(4, 9));
        System.out.println(getMultiplication(45, 23));
        System.out.println(getDivision(67, 2));
    }

    private static int getAddition(int num1, int num2) {
        return num1 + num2;
    }

    private static int getSubtraction(int num1, int num2) {
        return num1 - num2;
    }

    private static int getMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    private static int getDivision(int num1, int num2) {
        return num1 / num2;
    }
}
