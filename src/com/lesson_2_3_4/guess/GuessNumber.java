package com.lesson_2_3_4.guess;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GuessNumber {
    private int targetNum;
    private Player[] players;

    public GuessNumber(Player... players) {
        this.players = players;
        int len = players.length;
        for (int i = players.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * i);
            Player temp = players[j];
            players[j] = players[i];
            players[i] = temp;
        }
        System.out.println("Порядок ход игроков: ");
        for ( Player player : players ) {
            System.out.print( ' ' + player.getName());
        }
        System.out.println( );
    }

    public void play() {
        clearPlayerAttempts();
        System.out.println("Угадай число (у каждого игрока по 10 попыток)");
        targetNum = (int) (1 + Math.random() * 100);
        while (!isGuessed()) {
        }

        printPlayerNums();
    }

    private void clearPlayerAttempts() {
        for (Player player : players) {
            player.clearAttempts();
        }
    }

    private boolean isGuessed() {
        for (Player player : players) {
            if (player.getCountAttempts() == 10) {
                System.out.println("\tУ " + player.getName() + " закончились попытки");
                return false;
            }
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.printf("\n\t Ваш ход " + player.getName() + " -> ");
                try {
                    player.addNum(scanner.nextInt());
                    break;
                } catch (Exception error) {
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
}

