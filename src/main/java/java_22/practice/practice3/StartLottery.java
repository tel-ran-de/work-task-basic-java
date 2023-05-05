package java_22.practice.practice3;

public class StartLottery {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int[] userNumber = Utils.getUserLotteryNumber();
        lottery.runLottery();
        int result = Utils.compareWinnerNumbers(lottery.getWinnerNumber(), userNumber);
        System.out.println(result + " digits matched!");
    }
}
