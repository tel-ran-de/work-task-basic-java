package java_14.tasks;

public class Task3 {
    public static void main(String[] args) {
        int x = 10;
        int sum = 0;

        do {
            sum += x;
            x--;
        } while (x > 10);
        System.out.println("Summation: " + sum);
    }
}
