package java_19.tasks;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        // create a StringBuilder object using StringBuilder(CharSequence) constructor
        StringBuilder stringBuilder1 = new StringBuilder("AAAABBBCCCC");

        // create a StringBuilder object using StringBuilder(capacity) constructor
        StringBuilder stringBuilder2 = new StringBuilder(10);

        // create a StringBuilder object using StringBuilder(String) constructor
        StringBuilder stringBuilder3 = new StringBuilder("StartaUniversity");

        stringBuilder.append("StartaUniversity");
        System.out.println("String = " + stringBuilder);

        System.out.println("String1 = " + stringBuilder1);

        System.out.println("String2 capacity = " + stringBuilder2.capacity());

        System.out.println("String3 = " + stringBuilder3);

        // reverse the string
        StringBuilder reverseStr = stringBuilder.reverse();
        System.out.println(reverseStr);
    }
}
