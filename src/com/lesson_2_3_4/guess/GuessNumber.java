package com.lesson_2_3_4.guess;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GuessNumber {
    private static int LIMIT_ATTEMPTS = 10;
    private static int LIMIT_ROUNDS = 3;
    private int targetNum;
    private Player[] players;

    private int rounds;

    public GuessNumber(Player... players) {
        this.players = players;
        castLots();
    }

    public void play() {
        System.out.println("Угадай число (у каждого игрока по 10 попыток)");
        while (rounds <= LIMIT_ROUNDS) {
            rounds++;
            System.out.println("Раунд " + rounds + " из 3");
            clearPlayerAttempts();
            targetNum = (int) (1 + Math.random() * 100);
            while (!isGuessed()) {
            }
            printPlayerNums();
            if (rounds == LIMIT_ROUNDS) {
                printWinner();
                clearPlayerScore();
            }
            clearPlayerAttempts();
        }
    }

    private void castLots() {
        int len = players.length;
        for (int i = len - 1; i > 0; i--) {
            int j = (int) (Math.random() * i);
            Player temp = players[j];
            players[j] = players[i];
            players[i] = temp;
        }
        System.out.println("Порядок хода игроков: ");
        for (Player player : players) {
            System.out.print(' ' + player.getName());
        }
        System.out.println();
    }

    private void clearPlayerAttempts() {
        for (Player player : players) {
            player.clearAttempts();
        }
    }

    private void clearPlayerScore() {
        for (Player player : players) {
            player.clearScore();
        }
    }

    private boolean isGuessed() {
        for (Player player : players) {
            if (player.getCountAttempts() == LIMIT_ATTEMPTS) {
                System.out.println("\tУ " + player.getName() + " закончились попытки");
                return false;
            }
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.printf("\t Ваш ход " + player.getName() + " -> ");
                try {
                    player.addNum(scanner.nextInt());
                    break;
                } catch (RuntimeException error) {
                    System.out.print("Ошибка: " + error.getMessage());
                }
            }
            if (compareNumbers(player)) {
                return true;
            }
        }
        return false;
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

    private void printPlayerNums() {
        for (Player player : players) {
            System.out.println("Шаги " + player.getName() + ":");
            for (int num : player.getNums()) {
                System.out.print(" " + num);
            }
            System.out.println();
        }
    }

    private void printWinner() {
        String nameWinner = null;
        for (int i = 0; i < players.length - 1; i++) {
            int scoreWinPlayer1 = players[i].getScoreWin();
            int scoreWinPlayer2 = players[i - 1].getScoreWin();
            if (scoreWinPlayer1 > scoreWinPlayer2) {
                nameWinner = players[i].getName();
            } else if (scoreWinPlayer1 < scoreWinPlayer2) {
                nameWinner = players[i - 1].getName();
            }
        }
        System.out.println(nameWinner.isEmpty() ? "Ничья" : "Победил игрок " + nameWinner);
    }
}

