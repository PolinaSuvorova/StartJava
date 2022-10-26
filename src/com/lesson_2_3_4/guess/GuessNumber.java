package com.lesson_2_3_4.guess;

import java.util.Arrays;
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
        destroyPlayerAttempts();
        System.out.println("Угадай число (у каждого игрока по 10 попыток)");
        targetNum = (int) Math.floor(Math.random() * 100);
        try {
            do {
                if (stepPlayer(player1)) {
                    break;
                }
                if (stepPlayer(player2)) {
                    break;
                }
            } while (true);
        } catch (Exception error) {
            System.out.println("\t" + error.getMessage());
        }
        System.out.println("Шаги " + player1.getName() + ": " +
                            Arrays.toString(player1.getNumsAttempt()));
        System.out.println("Шаги " + player2.getName() + ": " +
                            Arrays.toString(player2.getNumsAttempt()));
    }

    public boolean stepPlayer(Player player) throws Exception {
        Scanner scanner = new Scanner(System.in);
        if (player.getCountAttempts() == 10) {
            throw new Exception("У " + player.getName() + " закончились попытки");
        }
        System.out.print("\t Ваш ход " + player.getName() + " -> ");
        player.enterNum(scanner.nextInt());
        return compareNumbers(player);
    }

    private void destroyPlayerAttempts() {
        player1.destroyAttempts();
        player2.destroyAttempts();
    }

    private boolean compareNumbers(Player player) {
        int playerNum = player.getNum();
        if (playerNum == targetNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNum +
                    " с " + playerNum + " попытки");
            return true;
        }
        if (playerNum > targetNum) {
            System.out.println("Число " + playerNum + " больше того, что загадал компьютер ");
        } else {
            System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
        }
        return false;
    }
}

