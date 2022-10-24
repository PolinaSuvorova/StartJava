package com.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner userInput = new Scanner(System.in);
        String userResponse;
        do {
            do {
                System.out.print("Введите математическое выражение: ");
                String expression = userInput.nextLine();
                int result = calculator.calculate(expression);
                if (!calculator.isError()) {
                    System.out.println("Результат выражения: " + expression + " = " + result);
                }
            } while (calculator.isError());
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                userResponse = userInput.nextLine();
            } while (!userResponse.equals("yes") && !userResponse.equals("no"));
        } while (userResponse.equals("yes"));
    }
}
