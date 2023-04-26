package java_7.hw;

import java.util.Scanner;

public class Hw1 {
    /*
    Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
    Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
    Например:
    ввод - mama, papa
    вывод - mapa
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordOne = scanner.nextLine();
        String wordTwo = scanner.nextLine();

        if ((wordOne.length() + wordTwo.length()) % 2 != 0) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println((wordOne.substring(0, wordOne.length()/2)) + (wordTwo.substring(wordTwo.length()/2)));
    }
}
