package java_14.practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Choose hero: ");
            System.out.println("1. Elf");
            System.out.println("2. Ork");
            System.out.println("3. Exit");

            System.out.println("Choose any one : ");
            choice = scan.next().charAt(0);
        } while (choice != '1' && choice != '2' && choice != '3');

        switch (choice) {
            case '1':
                System.out.println("You are Elf");
                break;

            case '2':
                System.out.println("You are Ork");
                break;

            case '3':
                System.out.println("See you later");
                break;
        }
    }
}
