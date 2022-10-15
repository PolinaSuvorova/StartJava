package com.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private int generatedNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        boolean exitFlag = false;
        System.out.println("Угадай число:");
        generatedNum = (int) Math.floor(Math.random() * 100);
        Scanner scanInputNumber = new Scanner(System.in);
        do {
            System.out.print("\t Ваш ход " + player1.getName() + " -> ");
            player1.setNumber(scanInputNumber.nextInt());
            if (compareNumbers(player1)) {
                exitFlag = true;
            } else {
                System.out.print("\t Ваш ход " + player2.getName() + " -> ");
                player2.setNumber(scanInputNumber.nextInt());
                if (compareNumbers(player2)) {
                    exitFlag = true;
                }
            }
        } while (!exitFlag);
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == generatedNum) {
            System.out.printf("Игрок %s победил!\n", player.getName());
            return true;
        }
        if (player.getNumber() > generatedNum) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер " );
        } else {
            System.out.println("Число" + player.getNumber() + " меньше того, что загадал компьютер"  );
        }
        return false;
    }
}

