package java_19.tasks;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world!");
        System.out.println(sb); // Output: "Hello world!"

        sb.insert(6, "beautiful ");
        System.out.println(sb); // Output: "Hello beautiful world!"

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        char[] chars = new char[sb.length()];
        sb.getChars(0, chars.length -1 , chars, 0);
        System.out.println(Arrays.toString(chars));
    }
}
