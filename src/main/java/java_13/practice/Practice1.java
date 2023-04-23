package java_13.practice;

public class Practice1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(getSum(a, b));
    }

    private static int getSum(int a, int b) {
        int sum = 0;
        for (int i = 1, j = a > b ? a : b; i <= j; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
