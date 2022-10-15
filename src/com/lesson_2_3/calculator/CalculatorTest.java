package com.lesson_2_3.calculator;

import com.lesson_2_3.calculator.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner userInput = new Scanner(System.in);
        String userResponse = "yes";
        do {
            System.out.print("Введите первое число: ");
            calculator.setA(userInput.nextInt());
            boolean goodSign = false;
            do {
                System.out.print("Введите знак математической операции: ");
                goodSign = calculator.setSign(userInput.next().charAt(0));
            } while (!goodSign);

            boolean goodB = false;
            do {
                System.out.print("Введите второе число: ");
                goodB = calculator.setB(userInput.nextInt());
            } while (!goodB);

            System.out.println("Результат выражения: " + calculator.getA() + calculator.getSign()
                    + calculator.getB() + "=" + calculator.calculate());

            userInput.nextLine();
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                userResponse = userInput.nextLine();
            } while (!userResponse.equals("yes") && !userResponse.equals("no"));
        } while (userResponse.equals("yes"));
    }
}
