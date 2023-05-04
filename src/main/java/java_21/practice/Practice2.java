package java_21.practice;

public class Practice2 {

    public static boolean isValidAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.equalsIgnoreCase("")) {
            return false;
        }
        if (accountNumber.length() == 14) {
            int count = 0;
            for (int i = 0; i < accountNumber.length(); i++) {
                if (!Character.isDigit(accountNumber.charAt(i))) {
                    return false;
                }
                if (accountNumber.charAt(i) == '0') {
                    count += 1;
                }
            }
            return count != 14;
        } else {
            return false;
        }
    }
}
