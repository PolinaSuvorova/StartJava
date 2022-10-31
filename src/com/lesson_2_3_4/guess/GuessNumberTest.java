package com.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static final int COUNT_PLAYERS = 3;
    public static void main(String[] args) {
        GuessNumber guessGame = new GuessNumber(createPlayers(COUNT_PLAYERS));
        String playerAnswer = "yes";
        while (playerAnswer.equals("yes")) {
            guessGame.play();
            do {
                System.out.print("Хотите продолжить игру? [yes/no] ");
                Scanner scanner = new Scanner(System.in);
                playerAnswer = scanner.nextLine();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        }
    }

    private static Player[] createPlayers(int countPlayers) {
        Player[] players = new Player[countPlayers];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < countPlayers; i++) {
            System.out.printf("игрок %S, введите имя: ", i + 1);
            players[i] = new Player(scan.nextLine());
        }
        return players;
    }
}
