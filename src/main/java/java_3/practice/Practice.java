package java_3.practice;

import java.util.Scanner;

public class Practice {
//    public static void main(String[] args) {
//        int var = 10; // Declared a Local Variable
//        // This variable is local to this main method only
//        System.out.println("Local Variable: " + var);
//    }

    String test;

    // Default Constructor
    public Practice() {
        this.test = "Aleks Reingand"; // initializing Instance Variable
    }

//    public static void main(String[] args) {
//        // Object Creation
//        Practice name = new Practice();
//        // Displaying O/P
//        System.out.println("Test name is: " + name.test);
//    }

    public static void main(String[] args) {
//        String str="I study Java";
//        System.out.println(str.length());
//        String substr = str.substring(8); // Starts with 0 and goes to end
//        System.out.println(substr);

        Scanner scanner = new Scanner(System.in);

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne / numberTwo);
    }

}
