package java_4.hw;

import java.util.Locale;

public class HwTask1 {
    public static void main(String[] args) {
//        Создайте строку через new - I study Basic Java!
//        Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//        Распечатать пред-последний символ строки. Используем метод String.charAt().
//        Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//        Вырезать строку Java c помощью метода String.substring().
//        Заменить все символы “а” на “о”.
//        Преобразуйте строку к верхнему регистру.
//        Преобразуйте строку к нижнему регистру.

        String str = new String("I study Basic Java!");
        runStringMethod(str);
    }

    private static void runStringMethod(String str) {
        System.out.println(str.charAt(str.length() - 2));
        System.out.println(str.contains("Java"));
        System.out.println(str.substring(str.length() - 5, str.length() - 1));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toLowerCase(Locale.ROOT));
    }
}
