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
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int min = number1;
        int max = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        System.out.println("\tИнтервал  (" + min + "," + max + ")");
        System.out.print("\tЧисла по убыванию: ");
        for (int i = max - 1; i > min; i--) {
            System.out.print(" " + i);
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
                System.out.println();
                count = 0;
            }
        }
        if (count != 0) {
            for (; 5 - count > 0; count++) {
                System.out.printf("%5d", 0);
            }
        }

        System.out.println("\n\n5.Проверка количества единиц на четность");
        int scrNumber = 1230321;
        int copySrcNumber = scrNumber;
        int countOnes = 0;
        while (copySrcNumber != 0) {
            int digit = copySrcNumber % 10;
            copySrcNumber /= 10;
            if (digit == 1) {
                countOnes++;
            }
        }
        String particlNo = "не";
        if (countOnes % 2 == 0) {
            particlNo = "";
        }
        System.out.printf("число %d содержит %sчётное(%d) количество единиц", scrNumber,
                particlNo, countOnes);

        System.out.println("\n\n6.Отображение фигур в консоли");
        int countLines;
        int countSymbols;
        for (countLines = 1; countLines <= 5; countLines++) {
            for (countSymbols = 1; countSymbols <= 10; countSymbols++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        countLines = 5;
        while (countLines != 0) {
            countSymbols = countLines;
            while (countSymbols != 0) {
                countSymbols--;
                System.out.print('#');
            }
            countLines--;
            System.out.println();
        }

        System.out.println();
        boolean midle = false;
        int midleRow = 3;
        int curIndex;
        countLines = 1;
        do {
            curIndex = countLines;
            do {
                System.out.print('$');
                curIndex--;
            } while (curIndex != 0);
            System.out.println();
            if (countLines == midleRow) {
                midle = true;
            }
            if (!midle) {
                countLines++;
            } else {
                countLines--;
            }
        } while (countLines != 0);

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
        srcNumber = 10001;
        copySrcNumber = srcNumber;
        int reversedNumber = 0;
        System.out.print("\tРеверсивное число: ");
        do {
            reversedNumber += copySrcNumber % 10;
            copySrcNumber /= 10;
            if (copySrcNumber > 0) {
               reversedNumber *= 10;
            }
        } while (copySrcNumber > 0);
        if (reversedNumber == srcNumber) {
            System.out.printf("число %d палиндром", reversedNumber);
        } else {
            System.out.printf("число %d не палиндром", reversedNumber);
        }

        System.out.println("\n\n9.Проверка, является ли число счастливым");
        int luckyNumber = 211301;
        int copyLuckyNumber = luckyNumber;
        int countDigits = 0;
        int sumHalfPartNumber = 0;
        int sumMinorPartNumber = 0;
        int midle10 = 1;
        while (copyLuckyNumber > 0) {
            copyLuckyNumber /= 10;
            countDigits++;
        }
        copyLuckyNumber = luckyNumber;
        for (int i = 1; i <= countDigits; i++) {
            int digit = copyLuckyNumber % 10;
            copyLuckyNumber /= 10;
            if (i <= countDigits / 2) {
                sumMinorPartNumber += digit;
                midle10 *= 10;
            } else {
                sumHalfPartNumber += digit;
            }
        }
        int luckyPart1 = luckyNumber / midle10;
        int luckyPart2 = luckyNumber % midle10;
        System.out.printf("\tСумма цифр %d = %d", luckyPart1, sumHalfPartNumber);
        System.out.printf("\n\tСумма цифр %d = %d", luckyPart2, sumMinorPartNumber);
        if (sumMinorPartNumber == sumHalfPartNumber) {
            System.out.printf("\nчисло %d счастливое", luckyNumber);
        } else {
            System.out.printf("\nчисло %d несчастливое", luckyNumber);
        }

        System.out.println("\n\n10. Вывод таблицы умножения Пифагора");
        for (int j = 1; j < 10; j++) {
            for (int k = 1; k < 10; k++) {
                System.out.printf("%4s", (k * j) + "  ");
                if (k == 1) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (j == 1) {
                System.out.println("------------------------------------");
            }
        }
    }
}
