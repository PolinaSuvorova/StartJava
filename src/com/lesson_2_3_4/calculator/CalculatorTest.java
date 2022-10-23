package com.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner userInput = new Scanner(System.in);
        String userResponse;
        do {
            boolean initCheck;
            do {
                System.out.print("Введите математическое выражение: ");
                String expression = userInput.nextLine();
                initCheck = calculator.initialize(expression);
            } while (!initCheck);

            System.out.println("Результат выражения: " + calculator.getA() + calculator.getSign() +
                    calculator.getB() + "=" + calculator.calculate());

            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                userResponse = userInput.nextLine();
            } while (!userResponse.equals("yes") && !userResponse.equals("no"));
        } while (userResponse.equals("yes"));
    }
}
