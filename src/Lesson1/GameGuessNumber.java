package Lesson1;

public class GameGuessNumber {
    public static void main(String[] args) {
        int computerNumber = 44;
        int playerNumber = 99;
        int step = 50;
        while (playerNumber != computerNumber) {
            if (playerNumber > computerNumber) {
                System.out.println("число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber -= step;
            } else if (playerNumber < computerNumber) {
                System.out.println("число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber += step;
            }
            if (step > 1) {
                step--;
            }
        }
        System.out.println("Вы победили!");
    }
}
