public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 45;
        boolean maleGender = true;
        double height = 1.72;
        String name = "Иван";
        char firstLetterName;

        if (age > 20) {
            System.out.println("\tВозраст больше 20");
        } else {
            System.out.println("\tВозраст меньше  21");
        }
        if (!maleGender) {
            System.out.println("\tЖенищина");
        } else {
            System.out.println("\tМужчина");
        }
        if (height < 1.80) {
            System.out.println("\tНизкий");
        } else {
            System.out.println("\tВысокий");
        }
        firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("\tПервай буква имени М ");
        } else if (firstLetterName == 'I') {
            System.out.println("\tПервай буква имени I ");
        } else {
            System.out.println("\tПервай буква имени не I и не M ");
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 100;
        int num2 = 200;
        int maxNumber = num1;
        int minNumber = num1;
        if (num1 > num2) {
            maxNumber = num1;
            minNumber = num2;
        } else if (num1 < num2) {
            maxNumber = num2;
            minNumber = num1;
        }
        if (maxNumber != minNumber) {
            System.out.println("\t Максисмальное число " + maxNumber + " " +
                    "минимальное число " + minNumber);
        } else {
            System.out.println("\t Числа равны");
        }

        System.out.println("\n3.Работа с числом");
        int num3 = 345;
        if (num3 != 0) {
            if (num3 % 2 == 0) {
                System.out.println("\tЧисло " + num3 + " четное");
            } else {
                System.out.println("\tЧисло " + num3 + " нечетное");
            }
            if (num3 < 0) {
                System.out.println("\tЧисло " + num3 + " отрицательно");
            } else {
                System.out.println("\tЧисло " + num3 + " положительное");
            }
        } else {
            System.out.println("\tЧисло равно 0");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int val4 = 345;
        int val5 = 145;
        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        short rankDigit1 = 0;
        short rankDigit2 = 0;
        short rankDigit3 = 0;
        if (val4 / 100 == val5 / 100) {
            digit1 = val4 / 100;
            rankDigit1 = 1;
        }
        if (val4 % 10 == val5 % 10) {
            digit3 = val5 % 10;
            rankDigit3 = 3;
        }
        if ((val4 % 100) / 10 == (val5 % 100) / 10) {
            digit2 = (val4 % 100) / 10;
            rankDigit2 = 2;
        }
        System.out.println("\tИсходные числа: " + val4 + " и " + val5);
        if (digit1 != 0 || digit2 != 0 || digit3 != 0) {
            System.out.println("\tОдинаковые цифры:");
            if (digit1 != 0) {
                System.out.println("\t\tРазряд " + rankDigit1 + " число " + digit1);
            }
            if (digit2 != 0) {
                System.out.println("\t\tРазряд " + rankDigit2 + " число " + digit2);
            }
            if (digit3 != 0) {
                System.out.println("\t\tРазряд " + rankDigit3 + " число " + digit3);
            }
        } else {
            System.out.println("\tОдинаковые цифры нет");
        }

        System.out.println("\n5.Определение буквы, числа или символа по их " +
                "коду");
        char valChar = '\u0057';
        if (valChar >= '\u0030' && valChar <= '\u0039') {
            System.out.println("\tСимвол " + valChar + " цифра");
        } else if ((valChar >= '\u0041' && valChar <= '\u005A') ||
                valChar == '\u00F0' ||
                (valChar >= '\u0080' && valChar <= '\u009F')) {
            System.out.println("\tСимвол " + valChar + " заглавная буква");
        } else if ((valChar >= '\u0061' && valChar <= '\u007A') ||
                (valChar >= '\u00A0' && valChar <= '\u00AF') ||
                (valChar >= '\u00E0' && valChar <= '\u00F1' && valChar != '\u00F0')) {
            System.out.println("\tСимвол " + valChar + " маленькая буква");
        } else {
            System.out.println("\tСимвол " + valChar + "не буква и не число");
        }

        System.out.println("\n6.Определение суммы вклада и начисленных банком %");
        double deposit = 300_000.00;
        double depositMin7 = 100_000;
        double depositMax7 = 300_000;
        int percent = 5;
        if (deposit >= depositMin7 && deposit <= depositMax7) {
            percent = 7;
        } else if (deposit > depositMax7) {
            percent = 10;
        }
        System.out.println("\tСумма вклада: \t\t" + deposit);
        System.out.println("\tНачисленный %: \t\t" + deposit * percent / 100);
        System.out.println("\tИтого с %: \t\t\t" + (deposit + deposit * percent / 100));

        System.out.println("\n7.Определение оценки по предметам");
        byte percentHistory = 58;
        byte percentProgramming = 91;
        byte scoreHistory = 2;
        byte scoreProgramming = 2;
        byte scoreAverage = 2;
        byte maxPercent2 = 60;
        byte maxPercent3 = 73;
        byte maxPercent4 = 91;

        if (percentHistory > maxPercent2 && percentHistory <= maxPercent3) {
            scoreHistory = 3;
        } else if (percentHistory > maxPercent3 && percentHistory <= maxPercent4) {
            scoreHistory = 4;
        } else if (percentHistory > maxPercent4) {
            scoreHistory = 5;
        }
        if (percentProgramming > maxPercent2 && percentProgramming <= maxPercent3) {
            scoreProgramming = 3;
        } else if (percentProgramming > maxPercent3 && percentProgramming <= maxPercent4) {
            scoreProgramming = 4;
        } else if (percentProgramming > maxPercent4) {
            scoreProgramming = 5;
        }
        int percentAverage = (percentProgramming + percentHistory) / 2;
        if (percentAverage > maxPercent2 && percentAverage <= maxPercent3) {
            scoreAverage = 3;
        } else if (percentAverage > maxPercent3 && percentAverage <= maxPercent4) {
            scoreAverage = 4;
        } else if (percentAverage > maxPercent4) {
            scoreAverage = 5;
        }
        System.out.println("\tИстория " + " = " + scoreHistory);
        System.out.println("\tПрограммирование " + " = " + scoreProgramming);
        System.out.println("\tСредний балл " + scoreAverage);
        System.out.println("\tСредний процент " + percentAverage + "%");

        System.out.println("\n8.Расчет прибыли");
        double sumRent = 5_000.00;
        double sumSale = 13_000.00;
        double costPrice = 9_000.00;
        double annualProfit = (sumSale - costPrice - sumRent) * 12;
        System.out.printf("\tприбыль за год: %s руб.", annualProfit);

        System.out.println("\n\n9.Подсчет количества банкнот");
        int sumAll = 567;
        int count100 = sumAll / 100;
        int count10 = (sumAll - count100 * 100) / 10;
        int count1 = sumAll % 10;
        int count10limit = 5;
        System.out.println("\t Для суммы " + sumAll + " необходимо: " +
                count100 + " купюр по 100," +
                "\t " + count10 + " купюр по 10," +
                "\t " + count1 + " купюр по 1");
        if (count10 > count10limit) {
            count1 += (count10 - count10limit) * 10;
            count10 = count10limit;
        }
        System.out.println("\t Для суммы " + sumAll + " выбрано: " +
                "\t" + count100 + " купюр по 100," +
                "\t " + count10 + " купюр по 10," +
                "\t " + count1 + " купюр по 1");
        sumAll = count100 * 100 + count10 * 10 + count1;
        System.out.println("\t Проверка суммы: " + sumAll);
    }
}
