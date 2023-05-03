package java_19.practice;

public class Practice2 {

    public static void main(String[] args) {
        String str = "mama papa";
        System.out.println(str);

        System.out.print(reverseWords(str));
    }

    // Function to reverse words
    public static String reverseWords(String str) {
        int countWorld = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                countWorld++;
            }
        }

        String[] worlds = new String[countWorld];
        StringBuilder stringBuilder = new StringBuilder();

        for (int j = 0; j <= str.length(); j++) {
            if (j == str.length()) {
                countWorld = countWorld - 1;
                worlds[countWorld] = stringBuilder.toString();
                stringBuilder = new StringBuilder();
            } else if (str.charAt(j) != ' ') {
                stringBuilder.append(str.charAt(j));
            } else {
                countWorld = countWorld - 1;
                worlds[countWorld] = stringBuilder.toString();
                stringBuilder = new StringBuilder();
            }
        }

        for (int i = 0; i < worlds.length; i++) {
            stringBuilder.append(worlds[i]);
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }
}
