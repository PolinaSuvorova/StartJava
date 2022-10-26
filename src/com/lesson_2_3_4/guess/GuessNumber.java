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
        //targetNum = (int) Math.floor(Math.random() * 10);
        targetNum = 10;
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
        showSteps( player1 );
        showSteps( player2);
    }
    public void showSteps( Player player){
        System.out.println("Шаги " + player.getName() + ":" );
        for (int num: player.getNumsAttempt() ) {
            System.out.print(" " + num );
        }
        System.out.println();
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
                    " с " + player.getCountAttempts() + " попытки");
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

