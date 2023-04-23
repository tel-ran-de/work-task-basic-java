package java_11.practice;

public class PracticeAdd {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk;

        canWalk = getAvailableWalk(isWeekend, isRain);
        System.out.println("can walk - " + canWalk);
    }

    private static boolean getAvailableWalk(boolean isWeekend, boolean isRain) {
        return isWeekend && !isRain;
    }
}
