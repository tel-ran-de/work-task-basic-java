package java_9.tasks;

public class UnaryTest {
    public static void main(String[] args) {
        // initializing variables
        int num = 5;
        increment(5);
    }

    public static void increment(int num) {
        // first 5 gets printed and then increment to 6
        System.out.println("Post increment = " + num++);

        // num was 6, incremented to 7 then printed
        System.out.println("Pre increment = " + ++num);
    }
}
