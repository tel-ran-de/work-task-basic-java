package java_7.tasks.task1;

public class CustomMethod {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        getSum(3, 4);
        getReturnSum(3, 4);
    }

    private static int getReturnSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    private static void getSum(int a, int b) {
        System.out.println(a + b);
    }

}
