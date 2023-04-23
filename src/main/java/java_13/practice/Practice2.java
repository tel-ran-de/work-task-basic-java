package java_13.practice;

public class Practice2 {
    public static void main(String[] args) {
        getLetters("I don't like rain");
    }

    private static void getLetters(String str) {
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) != '!'
                    && str.charAt(i) != ','
                    && str.charAt(i) != '.'
                    && str.charAt(i) != '!'
                    && str.charAt(i) != '?'
                    && str.charAt(i) != ' '
                    && str.charAt(i) != 39) {

                System.out.print(str.charAt(i) + (i == str.length() - 1 ? "" : ", "));
            }
    }
}
