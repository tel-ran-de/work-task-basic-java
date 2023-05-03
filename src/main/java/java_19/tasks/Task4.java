package java_19.tasks;

public class Task4 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("It is String Builder Object");
        System.out.println(stringBuffer);

        // Replacing substring from index 13 to index 20
        stringBuffer.replace(13, 20, "Buffer");

        System.out.println("After replacing string buffer = " + stringBuffer);
    }
}
