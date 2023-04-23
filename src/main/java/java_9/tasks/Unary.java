package java_9.tasks;

public class Unary {
    public static void main(String[] args) {
        performingUnaryOperation();
    }

    private static void performingUnaryOperation() {
        // variable declaration
        int n1 = 20;

        System.out.println("Number = " + n1);

        // Performing unary operation
        n1 = -n1;

        // Print the result number
        System.out.println("Result = " + n1);
    }

    public static void increment() {
        // initializing variables
        int num = 5;

        // first 5 gets printed and then increment to 6
        System.out.println("Post increment = " + num++);

        // num was 6, incremented to 7 then printed
        System.out.println("Pre increment = " + ++num);
    }
}
