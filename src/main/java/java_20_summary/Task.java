package java_20_summary;

public class Task {
    public static void main(String[] parameters) {
        default int integer = 3;
        public char character = '0';
        private int result = integer / character;
        System.out.println(result);

        String string = "String1";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("String1");
        if (string == stringBuilder.toString()) {
            string = new String("String2");
        }
        System.out.println(string);
    }
}
