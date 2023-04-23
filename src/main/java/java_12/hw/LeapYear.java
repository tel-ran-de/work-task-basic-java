package java_12.hw;

public class LeapYear {
    /*
    - Implement the program that ask user to input the year, and print the is this year isLeap or no
    */
    public static void main(String[] args) {
        isLeapYear(2000);
    }

    public static void isLeapYear(int year) {
        boolean isLeap = false;

        /*
        if year is divisible by 400 then
            is_leap_year
        else if year is divisible by 100 then
            not_leap_year
        else if year is divisible by 4 then
            is_leap_year
        else
            not_leap_year
         */

        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeap = true;
            } else {
                isLeap = false;
            }
        } else {
            isLeap = false;
        }

//        isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
