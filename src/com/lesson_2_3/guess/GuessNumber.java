import java.util.Scanner;

public class GuessNumber {
    private int targetNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        System.out.println("Угадай число:");
        targetNum = (int) Math.floor(Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("\t Ваш ход " + player1.getName() + " -> ");
            player1.setNumber(scanner.nextInt());
            if (compareNumbers(player1)) {
                break;
            }

            System.out.print("\t Ваш ход " + player2.getName() + " -> ");
            player2.setNumber(scanner.nextInt());
            if (compareNumbers(player2)) {
                break;
            }
        } while (true);
    }

    private boolean compareNumbers(Player player) {
        int playerNumber = player.getNumber();
        if (playerNumber == targetNum) {
            System.out.printf("Игрок %s победил!\n", playerNumber);
            return true;
        }
        if (playerNumber > targetNum) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер ");
        } else {
            System.out.println("Число" + playerNumber + " меньше того, что загадал компьютер");
        }
        return false;
    }
}

