package Lesson2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner userInput = new Scanner(System.in);
        String  userResponse = "yes";
        do {
            System.out.print("Введите первое число: ");
            calculator.setA(userInput.nextInt());
            do {
                System.out.print("Введите знак математической операции: ");
                calculator.setSign(userInput.next().charAt(0));
            } while (!calculator.checkSign(calculator.getSign(), true));

            do {
                System.out.print("Введите второе число: ");
                calculator.setB(userInput.nextInt());
            } while (!calculator.checkDivision(calculator.getSign(),
                    calculator.getB(), true));
            System.out.println("Результат выражения: " + calculator.getA() + calculator.getSign()
                    +calculator.getB()+ "=" + calculator.calculate());

            userInput.nextLine();
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                userResponse = userInput.nextLine();
            } while (!userResponse.equals("yes") & !userResponse.equals("no"));

        } while (userResponse.equals("yes") );
    }
}
