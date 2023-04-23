package java_14.hw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hw2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        try {
            sum = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("countDay = " + getCountWithdrawOfDays(sum));
    }

    private static int getCountWithdrawOfDays(int sum) {
        int divider;
        int countDay = 0;
        // greatest common divisor
        while (sum >= 1) {
            countDay++;
            divider = getGcd(sum);
            sum -= divider;
            System.out.println("withdraw " + divider + " balance = " + sum);
        }
        return countDay;
    }

    private static int getGcd(int sum) {
        if (sum != 1) {
            for (int i = sum - 1; i >= 1; i--) {
                if (sum % i == 0) {
                    return i;
                }
            }
        }
        return 1;
    }
}
