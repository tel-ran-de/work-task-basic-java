package java_14.tasks;

public class Task2 {
    public static void main(String[] args) {
        // initial counter variable
        int i = 0;

        do {
            // Body of loop that will execute minimum 1 time for sure no matter what
            System.out.println("Я в теле DO");
            i++;
        }
        // Checking condition
        // Note: It is being checked after minimum 1 iteration
        while (i < 3);
    }
}
