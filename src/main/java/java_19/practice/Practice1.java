package java_19.practice;

public class Practice1 {
    public static void main(String[] args) {
        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        StringBuilder sb = new StringBuilder();
        sb.append(arr, 0, arr.length);
        System.out.println(sb);
        sb.replace(5, 6, "e");
        System.out.println(sb);

        System.out.println(concatReversStr("mama", "papa"));
    }

    public static String concatReversStr(String str1, String str2) {
        StringBuilder str = new StringBuilder();
        str.append(str1);
        str.append(str2);
        str.reverse();
        return str.toString();
    }
}
