package com.lesson1.finаl;

public class Calculator {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        int result;
        char sign = '^';
        if (sign == '-') {
            result = a - b;
        } else if (sign == '+') {
            result = a + b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '%') {
            if (b != 0) {
                result = a % b;
            } else {
                System.out.println("Деление на 0 не предусмотрено, расчёт пропущен");
                return;
            }
        } else if (sign == '/') {
            if (b != 0) {
                result = a % b;
            } else {
                System.out.println("Деление на 0 не предусмотрено, расчёт пропущен");
                return;
            }
        } else if (sign == '^') {
            result = 1;

            for (int i = 1; i <= b; i++) {
                result *= a;
            }
        } else {
            System.out.println("Знак вычисления " + sign + " не предусмотрен");
            return;
        }
        System.out.println( a + " " + sign + " " + b + " = " + result);
    }
}

