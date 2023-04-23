package java_12.tasks;

public class Task2 {
    public static void main(String[] args) {
        int day = 2;
        String dayType;

        switch (day) {
            // Multiple cases without break statements
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;

            default:
                dayType = "Invalid day type";
        }

        System.out.println("Day is a " + dayType + " switch cases");

        dayType = day >= 1 && day <= 5 ? "Weekday" : "Weekend";
        System.out.println("Day is a " + dayType + " ternary");
    }
}
