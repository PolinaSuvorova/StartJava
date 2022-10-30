package com.lesson_2_3_4.guess;

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
        clearPlayerAttempts();
        System.out.println("Угадай число (у каждого игрока по 10 попыток)");
        targetNum = (int) Math.floor(Math.random() * 10);

        do {
            if (isGuessed(player1) || isGuessed(player2)) {
                break;
            }
        } while (true);
        printPlayerNums(player1);
        printPlayerNums(player2);
    }

    private void clearPlayerAttempts() {
        player1.clearAttempts();
        player2.clearAttempts();
    }

    private boolean isGuessed(Player player) {
        if (player.getCountAttempts() == 10) {
            System.out.println("\tУ " + player.getName() + " закончились попытки");
            return false;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t Ваш ход " + player.getName() + " -> ");
        player.addNum(scanner.nextInt());
        return compareNumbers(player);
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

    private void printPlayerNums(Player player) {
        System.out.println("Шаги " + player.getName() + ":");
        for (int num : player.getNums()) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}

