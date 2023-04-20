package java_4.practice;

import java.util.Scanner;

public class PracticeAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        System.out.println("Добрый день " + next);
        System.out.println("Ваше имя начинается с символа " + next.charAt(0) + " и заканчивается на символ " + next.charAt(next.length()-1));
    }
}
