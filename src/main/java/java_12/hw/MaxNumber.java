package java_12.hw;

public class MaxNumber {
    /*
    - Implement the program that ask user to input three integers (use Scanner), and print the maximum of three numbers.
        19,10,1 ->19
     */
    public static void main(String[] args) {
        getMaxNumber(3, 5, 7);
    }

    public static void getMaxNumber(int num1, int num2, int num3) {
        String numberMax = " is the maximum number.";

//         System.out.println(Math.max(num1, Math.max(num2, num3)) + numberMax);

        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1 + numberMax);
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + numberMax);
        else
            System.out.println(num3 + numberMax);
    }
}
