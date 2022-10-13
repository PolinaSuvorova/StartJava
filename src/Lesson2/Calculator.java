package Lesson2;

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
        this.b = 0;
        if (checkDivision(b)) {
            this.b = b;
            return true;
        }
        return false;
    }

    public char getSign() {
        return sign;
    }

    public boolean setSign(char sign) {
        this.sign = ' ';
        if (checkSign(sign)) {
            this.sign = sign;
            return true;
        }
        return false;
    }

    private boolean checkSign(char sign) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%') {
            this.sign = sign;
            return true;
        }
        System.out.println("\tНедопустимый знак операции (* / + - % ^)");
        return false;
    }

    private boolean checkDivision(int b) {
        if ((sign != '/' && sign != '%') || b != 0) {
            return true;
        }
        System.out.println("\tДеление на 0 не предусмотрено");
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
                return 0;
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
                return 0;
        }
        return 0;
    }
}

