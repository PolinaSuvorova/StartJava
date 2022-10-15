package com.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scannerStep = new Scanner(System.in);
        System.out.print("Игрок 1 введите имя: ");
        Player player1 = new Player(scannerStep.nextLine());

        System.out.print("Игрок 2 введите имя: ");
        Player player2 = new Player(scannerStep.nextLine());

        GuessNumber guessGame = new GuessNumber(player1, player2);
        String playerAnswer = "yes";
        while (playerAnswer.equals("yes")) {
            guessGame.launch();
            do {
                System.out.print("Хотите продолжить игру? [yes/no] ");
                playerAnswer = scannerStep.nextLine();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        }
    }
}
