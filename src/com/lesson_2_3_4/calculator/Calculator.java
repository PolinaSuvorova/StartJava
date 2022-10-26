package com.lesson_2_3_4.calculator;

public class Calculator {
    private static int a;
    private static int b;
    private static char sign;

    public static void setA(int a) {
        Calculator.a = a;
    }

    public static void setB(int b) throws Exception {
        if ((sign != '/' && sign != '%') || b != 0) {
            Calculator.b = b;
            return;
        }
        throw new Exception("Деление на 0 не предусмотрено");
    }

    public static void setSign(char sign) throws Exception {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%') {
            Calculator.sign = sign;
            return;
        }
        throw new Exception("Недопустимый знак операции (* / + - % ^)");
    }

    public static void initialize(String expression) throws Exception {
        String[] elementsExpression = expression.split(" ");
        if (!elementsExpression[0].matches("\\d+") || !elementsExpression[2].matches("\\d+")) {
            throw new Exception("Возможен ввод только целых, положительных чисел");
        }
        setA(Integer.parseInt(elementsExpression[0]));
        setSign(elementsExpression[1].charAt(0));
        setB(Integer.parseInt(elementsExpression[2]));
    }

    public static int calculate(String expression) throws Exception {
        Calculator.initialize(expression);
        return switch (sign) {
            case '+' -> Math.addExact(a, b);
            case '-' -> Math.subtractExact(a, b);
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> Math.floorDiv(a, b);
            case '^' -> (int) Math.pow(a, b);
            case '%' -> Math.floorMod(a, b);
            default -> 0;
        };
    }
}

