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

    public void setB(int b) {
        this.b = b;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = ' ';
        if (checkSign(sign,false)) {
            this.sign = sign;
            return;
        }
    }

    public boolean checkSign(char sign, boolean printError) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%') {
            this.sign = sign;
            return true;
        }
        if (printError){
            System.out.println("\tНедопустимый знак операции (* / + - % ^)");
        }
        return false;
    }

    public boolean checkDivision(char sign, int b,boolean printError) {
        if ((sign != '/' && sign != '%') || b != 0) {
            return true;
        }
        if (printError) {
            System.out.println("\tДеление на 0 не предусмотрено");
        }
        return false;
    }

    public int calculate() {
        if (checkSign(sign,true) && checkDivision(sign, b, true)) {
            switch (sign) {
                case '+':
                    return a + b;
                case '-':
                    return a - b;
                case '*':
                    return a * b;
                case '/':
                    return a / b;

                case '^':
                    int result = 1;
                    for (int i = 1; i <= b; i++) {
                        result *= a;
                    }
                    return result;
                case '%':
                    return a % b;
            }
        }
        return 0;
    }
}
