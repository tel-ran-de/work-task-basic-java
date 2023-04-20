package java_4.tasks;

public class Task2 {
    public static void main(String[] args) {
        int intNum = 128;
        System.out.println("int = " + intNum);

        long longNum = intNum;
        System.out.println("int to long = " + longNum);

        byte byteNum = (byte) intNum;
        System.out.println("int to byte = " + byteNum);

        double doubleNum = 0.123456;
        intNum = (int) doubleNum;
        System.out.println("double to int = " + doubleNum);

        doubleNum = intNum;
        System.out.println("int to double = " + doubleNum);
    }
}
