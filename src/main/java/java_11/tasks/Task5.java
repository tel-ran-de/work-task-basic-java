package java_11.tasks;

public class Task5 {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before the return instruction");

        if (t) {
            return;
        }
        // Compiler will bypass every statement after return
        System.out.println("This won't execute");
    }
}
