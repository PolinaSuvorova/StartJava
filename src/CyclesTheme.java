public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел");
        int beginLine = -10;
        int endLine = 21;
        int currentPoint = beginLine;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (currentPoint % 2 == 0) {
                sumEven += currentPoint;
            } else {
                sumOdd += currentPoint;
            }

            currentPoint++;
        } while (currentPoint <= endLine);
        System.out.println("\tНа отрезке [" + beginLine + "," + endLine +
                "]\n\t Сумма чётных чисел = " + sumEven +
                "\n\t Сумма нечётных чисел = " + sumOdd);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int srcNumber1 = 10;
        int srcNumber2 = 5;
        int srcNumber3 = -1;
        int minNumber = srcNumber1;
        int maxNumber = srcNumber1;
        if (srcNumber2 < minNumber) {
            minNumber = srcNumber2;
        }
        if (srcNumber3 < minNumber) {
            minNumber = srcNumber3;
        }
        if (srcNumber2 > maxNumber) {
            maxNumber = srcNumber2;
        }
        if (srcNumber3 > maxNumber) {
            maxNumber = srcNumber3;
        }
        System.out.println("\tИнтервал  (" + minNumber + "," + maxNumber + ")");
        System.out.print("\tЧисла по убыванию: ");
        for (int i = maxNumber; i >= minNumber; i--) {
            if (i == maxNumber) {
                System.out.print(i);
            } else if (i == srcNumber1 || i == srcNumber2 || i == srcNumber3) {
                System.out.print(", " + i);
            }
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int initNumber = 1234;
        int reverseNumber = 0;
        int sumDigit = 0;
        while (initNumber != 0) {
            reverseNumber = reverseNumber * 10;
            int numDiv = initNumber % 10;
            sumDigit += numDiv;
            reverseNumber = reverseNumber + numDiv;
            initNumber = initNumber / 10;
        }
        System.out.println("\tРеверсивное число: " + reverseNumber + "\n\t Сумма: " + sumDigit);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк ");
        int index1 = 0;
        System.out.println(" числа в полуинтервале [ 1, 24 ) шаг 2");
        for (int i = 1; i < 24; i += 2) {
            index1++;
            System.out.printf("%5d", i);
            if (index1 == 5) {
                System.out.print("\n");
                index1 = 0;
            }
        }
        if (index1 != 0) {
            index1 = 5 - index1;
            for (int i = 1; i <= index1; i++) {
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
