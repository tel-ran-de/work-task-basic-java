package java_12.tasks;

public class Task1 {
    public static void main(String[] args) {
        int day = 2;
        String dayString;

        // Switch case
        switch (day) {
            // Case
            case 1:
                dayString = "Monday";
                break;
            // Case
            case 2:
                dayString = "Tuesday";
                break;
            // Case
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
        }
        System.out.println(dayString);
    }
}
