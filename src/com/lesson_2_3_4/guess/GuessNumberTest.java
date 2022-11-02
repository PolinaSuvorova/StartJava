package com.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static final int COUNT_PLAYERS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber guessGame = new GuessNumber(createPlayers( scanner ));
        String playerAnswer = "yes";

        while (playerAnswer.equals("yes")) {
            guessGame.play();
            do {
                System.out.print("Хотите продолжить игру? [yes/no] ");
                playerAnswer = scanner.nextLine();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        }
    }

    private static Player[] createPlayers(Scanner scanner) {
        Player[] players = new Player[COUNT_PLAYERS];
        for (int i = 0; i < COUNT_PLAYERS; i++) {
            System.out.printf("игрок %S, введите имя: ", i + 1);
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }
}
