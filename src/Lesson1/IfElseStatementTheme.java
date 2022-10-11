package Lesson1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 45;
        boolean maleGender = true;
        double height = 1.72;

        if (age > 20) {
            System.out.println("\tВозраст больше 20");
        } else {
            System.out.println("\tВозраст меньше  21");
        }
        if (!maleGender) {
            System.out.println("\tЖенщина");
        } else {
            System.out.println("\tМужчина");
        }
        if (height < 1.80) {
            System.out.println("\tНизкий");
        } else {
            System.out.println("\tВысокий");
        }
        char name = "Иван".charAt(0);
        if (name == 'M') {
            System.out.println("\tПервая буква имени М ");
        } else if (name == 'I') {
            System.out.println("\tПервая буква имени I ");
        } else {
            System.out.println("\tПервая буква имени не I и не M ");
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 100;
        int num2 = 200;
        if (num1 > num2) {
            System.out.println("\t Максимальное число " + num1 + " " +
                    "минимальное число " + num2);
        } else if (num1 < num2) {
            System.out.println("\t Максимальное число " + num2 + " " +
                    "минимальное число " + num1);
        } else {
            System.out.println("\t Числа равны");
        }

        System.out.println("\n3.Работа с числом");
        int srcNum = 345;
        if (srcNum != 0) {
            if (srcNum % 2 == 0) {
                System.out.print("\tЧисло " + srcNum + " четное,");
            } else {
                System.out.print("\tЧисло " + srcNum + " нечетное,");
            }
            if (srcNum < 0) {
                System.out.print(" отрицательное");
            } else {
                System.out.print(" положительное");
            }
        } else {
            System.out.println("\tЧисло равно 0");
        }

        System.out.println("\n\n4.Поиск одинаковых цифр в числах");
        int srcNum1 = 300;
        int srcNum2 = 145;
        System.out.println("\tИсходные числа: " + srcNum1 + " и " + srcNum2);
        boolean similarDigits = false;

        if (srcNum1 / 100 == srcNum2 / 100) {
            System.out.println("\t\tРазряд 1  число " + srcNum1 / 100);
            similarDigits = true;
        }
        if (srcNum1 % 100 / 10 == srcNum2 % 100 / 10) {
            System.out.println("\t\tРазряд 2 число " + (srcNum1 % 100) / 10);
            similarDigits = true;
        }
        if (srcNum1 % 10 == srcNum2 % 10) {
            System.out.println("\t\tРазряд 3 число " + srcNum2 % 10);
            similarDigits = true;
        }
        if (!similarDigits) {
            System.out.println("\tОдинаковых цифр нет");
        }

        System.out.println("\n5.Определение буквы, числа или символа по их коду");
        char someChar = '\u0073';
        if (someChar >= '0' && someChar <= '9') {
            System.out.println("\tСимвол " + someChar + " цифра");
        } else if (someChar == 'Ё' ||
                (someChar >= 'A' && someChar <= 'Z') ||
                (someChar >= 'А' && someChar <= 'Я')) {
            System.out.println("\tСимвол " + someChar + " заглавная буква");
        } else if (someChar == 'ё' ||
                (someChar >= 'а' && someChar <= 'п') ||
                (someChar >= 'р' && someChar <= 'я') ||
                (someChar >= 'a' && someChar <= 'z')) {
            System.out.println("\tСимвол " + someChar + " маленькая буква");
        } else {
            System.out.println("\tСимвол " + someChar + "не буква и не число");
        }

        System.out.println("\n6.Определение суммы вклада и начисленных банком %");
        double deposit = 300_000.00;
        int percent = 5;
        if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
        } else if (deposit > 300_000) {
            percent = 10;
        }
        double sumPercent = deposit * percent / 100;
        System.out.println("\tСумма вклада: \t\t" + deposit);
        System.out.println("\tНачисленный %: \t\t" + sumPercent);
        System.out.println("\tИтого с %: \t\t" + (deposit + sumPercent));

        System.out.println("\n7.Определение оценки по предметам");
        byte percentHistory = 58;
        byte percentProgramming = 91;
        byte scoreHistory = 2;
        byte scoreProgramming = 2;
        if (percentHistory > 60 && percentHistory <= 73) {
            scoreHistory = 3;
            System.out.println("\tИстория 3");
        } else if (percentHistory > 73 && percentHistory <= 91) {
            scoreHistory = 4;
            System.out.println("\tИстория 4");
        } else if (percentHistory > 91) {
            scoreHistory = 5;
            System.out.println("\tИстория 5");
        }
        if (percentProgramming > 60 && percentProgramming <= 73) {
            scoreProgramming = 3;
            System.out.println("\tПрограммирование 3");
        } else if (percentProgramming > 73 && percentProgramming <= 91) {
            scoreProgramming = 4;
            System.out.println("\tПрограммирование 4");
        } else if (percentProgramming > 91) {
            scoreProgramming = 5;
            System.out.println("\tПрограммирование 5");
        }
        int percentAverage = (percentProgramming + percentHistory) / 2;
        System.out.println("\tСредний процент " + percentAverage + "%");
        int scoreAverage = (scoreProgramming + scoreHistory) / 2;
        System.out.println("\tСредний балл " + scoreAverage);

        System.out.println("\n8.Расчет прибыли");
        double sumRent = 5_000.00;
        double sumSale = 9_000.00;
        double costPrice = 4_000.00;
        double annualProfit = (sumSale - costPrice - sumRent) * 12;
        if (annualProfit <= 0) {
            System.out.println("\tприбыль за год: " + annualProfit);
        } else {
            System.out.println("\tприбыль за год: +" + annualProfit);
        }

        System.out.println("\n\n9.Подсчет количества банкнот");
        int sumAll = 567;
        int count100 = sumAll / 100;
        int count10 = (sumAll - count100 * 100) / 10;
        int count1 = sumAll % 10;
        int count10limit = 5;
        System.out.println("\t Для суммы " + sumAll + " необходимо: \t" +
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
