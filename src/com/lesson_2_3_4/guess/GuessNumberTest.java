package com.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("игрок 1 введите имя: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("игрок 2 введите имя: ");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber guessGame = new GuessNumber(player1, player2);
        String playerAnswer = "yes";
        while (playerAnswer.equals("yes")) {
            guessGame.play();
            do {
                System.out.print("Хотите продолжить игру? [yes/no] ");
                playerAnswer = scanner.nextLine();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        }
    }
}
