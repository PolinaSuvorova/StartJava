public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int currentPoint = startRange;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (currentPoint % 2 == 0) {
                sumEven += currentPoint;
            } else {
                sumOdd += currentPoint;
            }
            currentPoint++;
        } while (currentPoint <= endRange);
        System.out.println("\tНа отрезке [" + startRange + "," + endRange +
                "]\n\t Сумма чётных чисел = " + sumEven +
                "\n\t Сумма нечётных чисел = " + sumOdd);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num1;
        int max = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("\tИнтервал  (" + min + "," + max + ")");
        System.out.print("\tЧисла по убыванию: ");
        for (int i = max; i >= min; i--) {
            if (i == max) {
                System.out.print(i);
            } else {
                System.out.print(", " + i);
            }
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int srcNumber = 1234;
        int sumDigits = 0;
        System.out.print("\tРеверсивное число: ");
        while (srcNumber != 0) {
            int digit = srcNumber % 10;
            sumDigits += digit;
            srcNumber /= 10;
            System.out.print(digit);
        }
        System.out.print("\n\tСумма: " + sumDigits);

        System.out.println("\n\n4.Вывод чисел на консоль в несколько строк ");
        System.out.println("числа в полуинтервале [ 1, 24 ) шаг 2");
        int count = 0;
        for (int i = 1; i < 24; i += 2) {
            count++;
            System.out.printf("%5d", i);
            if (count == 5) {
                System.out.println( );
                count = 0;
            }
        }
        if (count != 0) {
            for (; 5 - count > 0; count++) {
                System.out.printf("%5d", 0);
            }
        }

        System.out.println("\n\n5.Проверка количества единиц на четность");
        int initNumber1 = 1230321;
        int currentNumber1 = initNumber1;
        int count1 = 0;
        String particlNo = "не";
        while (currentNumber1 != 0) {
            long valDiv = currentNumber1 % 10;
            currentNumber1 /= 10;
            if (valDiv == 1) {
                ++count1;
            }
        }
        if (count1 % 2 == 0) {
            particlNo = "";
        }
        System.out.printf("число %d содержит %sчётное(%d) количество единиц", initNumber1,
                           particlNo, count1);

        System.out.println("\n\n6.Отображение фигур в консоли");
        int lines;
        int linesSub;
        for (lines = 1; lines <= 5; ++lines) {
            for (linesSub = 1; linesSub <= 10; ++linesSub) {
                System.out.print('*');
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        lines = 5;
        while (lines != 0) {
            for (linesSub = lines; linesSub != 0; linesSub--) {
                System.out.print('#');
            }
            lines--;
            System.out.print("\n");
        }
        System.out.print("\n");
        boolean midle = false;
        int midleRow = 3;
        int curIndex;
        lines = 1;
        do {
            curIndex = lines;
            do {
                System.out.print('$');
                curIndex--;
            } while (curIndex != 0);
            System.out.print("\n");
            if (lines == midleRow) {
                midle = true;
            }
            if (!midle) {
                lines++;
            } else {
                lines--;
            }
        } while (lines != 0);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf(" %4s %4s \n ", "DEC", "CHAR");
        for (int i = 1; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf(" %3d %4s \n ", i, (char) i);
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf(" %3d %4s \n ", i, (char) i);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        int srcPolindrom = 10001;
        int currentPolindrom = srcPolindrom;
        int newNumber = 0;
        int modPolindrom;
        int i10 = 1;
        int luckyNumber;
        do {
            modPolindrom = currentPolindrom % 10;
            currentPolindrom /= 10;
            if (modPolindrom == 0 && currentPolindrom != 0) {
                ++i10;
            } else {
                if (modPolindrom != 0 || currentPolindrom != 0) {
                    for (luckyNumber = 1; luckyNumber <= i10; ++luckyNumber) {
                        newNumber *= 10;
                    }
                }
                i10 = 1;
            }
            newNumber += modPolindrom;
        } while (modPolindrom != 0 || currentPolindrom != 0);

        if (newNumber == srcPolindrom) {
            System.out.printf("число %d палиндром", newNumber);
        } else {
            System.out.printf("число %d не палиндром", newNumber);
        }

        System.out.println("\n\n9.Проверка, является ли число счастливым");
        luckyNumber = 211301;
        int currentMod = luckyNumber;
        int countNumber = 0;
        int luckyPart1Sum = 0;
        int luckyPart2Sum = 0;
        int midle10 = 1;
        int var1000 = 0;
        while (var1000 != 0 || currentMod != 0) {
            var1000 = currentMod % 10;
            currentMod /= 10;
            countNumber++;
        }
        currentMod = luckyNumber;
        for (int i = 1; i <= countNumber; i++) {
            int valDiv = currentMod % 10;
            currentMod /= 10;
            if (i <= countNumber / 2) {
                luckyPart2Sum += valDiv;
                midle10 *= 10;
            } else {
                luckyPart1Sum += valDiv;
            }
        }
        int luckyPart1 = luckyNumber / midle10;
        int luckyPart2 = luckyNumber % midle10;
        System.out.printf("Сумма цифр %d = %d", luckyPart1, luckyPart1Sum);
        System.out.printf("\nСумма цифр %d = %d", luckyPart2, luckyPart2Sum);
        if (luckyPart2Sum == luckyPart1Sum) {
            System.out.printf("\nчисло %d счастливое", luckyNumber);
        } else {
            System.out.printf("\nчисло %d несчастливое", luckyNumber);
        }

        System.out.println("\n\n10.Таблица Пифагора");
        for (int i = 1; i < 10; i++) {
            System.out.print(" \n");
            for (int k = 1; k < 10; k++) {
                if (i * k != 1) {
                    System.out.printf("%3d", i * k);
                } else {
                    System.out.printf("%3s", "");
                }
                if (k == 1) {
                    System.out.print("|");
                }
            }
            if (i == 1) {
                System.out.printf("%s", "\n");
                for (int k = 0; k < 10; k++) {
                    System.out.printf("%s", "---");
                }
            }
        }

    }
}
