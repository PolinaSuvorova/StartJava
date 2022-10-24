package com.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;
    private boolean error;

    public void setA(int a) {
        this.a = a;
    }

    public boolean setB(int b) {
        if ((sign != '/' && sign != '%') || b != 0) {
            this.b = b;
            return true;
        }
        System.out.println("\tДеление на 0 не предусмотрено");
        return false;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
    public boolean setSign(char sign) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%') {
            this.sign = sign;
            return true;
        }
        System.out.println("\tНедопустимый знак операции (* / + - % ^)");
        return false;
    }

    public boolean initialize(String expression) {
        boolean setResult;
        String[] elementsExpression = expression.split(" ");
        setA(Integer.parseInt(elementsExpression[0]));
        setResult = setSign(elementsExpression[1].charAt(0));
        if (!setResult) {
            return false;
        }
        setResult = setB(Integer.parseInt(elementsExpression[2]));
        return setResult;

    }

    public int calculate(String expression) {
        setError(false);
        if (!initialize(expression)) {
            setError(true);
            return 0;
        }
        switch (sign) {
            case '+':
                return Math.addExact(a, b);
            case '-':
                return Math.subtractExact(a, b);
            case '*':
                return Math.multiplyExact(a, b);
            case '/':
                if (b != 0) {
                    return Math.floorDiv(a, b);
                }
                break;
            case '^':
                return (int) Math.pow(a, b);
            case '%':
                if (b != 0) {
                    return Math.floorMod(a, b);
                }
                break;
        }
        return 0;
    }
}

