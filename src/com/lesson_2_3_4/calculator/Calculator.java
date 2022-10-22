package com.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public boolean setB(int b) {
        if ((sign != '/' && sign != '%') || b != 0) {
            this.b = b;
            return true;
        }
        System.out.println("\tДеление на 0 не предусмотрено");
        return false;
    }

    public char getSign() {
        return sign;
    }

    public boolean setSign(char sign) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%') {
            this.sign = sign;
            return true;
        }
        System.out.println("\tНедопустимый знак операции (* / + - % ^)");
        return false;
    }

    public int calculate() {
        switch (sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                }
                break;
            case '^':
                int result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                return result;
            case '%':
                if (b != 0) {
                    return a % b;
                }
                break;
        }
        return 0;
    }
}

