package com.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userResponse;
        do {
            while (true) {
                try {
                    System.out.print("Введите математическое выражение: ");
                    String expression = userInput.nextLine();
                    int result = Calculator.calculate(expression);
                    System.out.println("Результат выражения: " + expression + " = " + result);
                    break;
                } catch (Exception error) {
                    System.out.println("\tОшибка: " + error.getMessage());
                }
            }
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                userResponse = userInput.nextLine();
            } while (!userResponse.equals("yes") && !userResponse.equals("no"));
        } while (userResponse.equals("yes"));
    }
}
