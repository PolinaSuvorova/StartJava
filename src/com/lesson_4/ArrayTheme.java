package com.lesson_4;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Реверс значений массива");
        int[] numsArr = {5, 4, 6, 3, 1, 2, 7};
        int len = numsArr.length - 1;
        printArr(numsArr);
        for (int i = 0; i < len / 2; i++, len--) {
            int tmp = numsArr[i];
            numsArr[i] = numsArr[len];
            numsArr[len] = tmp;
        }
        printArr(numsArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        numsArr = new int[10];
        len = numsArr.length;
        for (int i = 0; i < len; i++) {
            numsArr[i] = i;
        }
        int multDigits = 1;
        for (int i = 1; i < len - 1; i++) {
            multDigits *= numsArr[i];
            System.out.print(numsArr[i] + (i != len - 2 ? " * " : " = " + multDigits));
        }
        System.out.println("\n" + numsArr[0] + " " + numsArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] randomNums = new double[15];
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printArr(randomNums);
        double midleArrNum = randomNums[randomNums.length / 2];
        int countNilableNum = 0;
        System.out.printf("Число из середины массива: %6.3f", midleArrNum +
                "\n");
        for (int i = 0; i < randomNums.length; i++) {
            if (randomNums[i] > midleArrNum) {
                randomNums[i] = 0;
                countNilableNum++;
            }
        }
        printArr(randomNums);
        System.out.println("Всего обнулённых значений: " + countNilableNum);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] lettersArr = new char[26];
        char letter = 'A';
        for (int i = 0; i < lettersArr.length; i++) {
            lettersArr[i] = letter;
            letter++;
        }
        for (int i = lettersArr.length - 1; i >= 0; i--) {
            for (int j = lettersArr.length - 1; j >= i; j--) {
                System.out.print(lettersArr[j]);
            }
            System.out.println();
        }

        System.out.println("5. Генерация уникальных чисел");
        numsArr = new int[30];
        for (int i = 0; i < numsArr.length; i++) {
            int randomNum;
            do {
                randomNum = generateRandomNum(60, 100);
            } while (!checkUniqueNum(numsArr, randomNum));
            numsArr[i] = randomNum;
        }
        Arrays.sort(numsArr);
        for (int i = 0; i < numsArr.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%4d", numsArr[i]);
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] lines = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countLinesNotNillable = 0;
        for (String line : lines
        ) {
            if (!line.isBlank()) {
                countLinesNotNillable++;
            }
        }
        printArr(lines);

        if (countLinesNotNillable != 0) {
            String[] copyLines = new String[countLinesNotNillable];
            countLinesNotNillable = 0;
            int beginSourceIndex = 0;
            int currentIndexCopyLines = 0;
            for (int i = 0; i < lines.length; i++) {
                if (!lines[i].isBlank()) {
                    countLinesNotNillable++;
                    if (beginSourceIndex == 0) {
                        beginSourceIndex = i;
                    }
                } else if (countLinesNotNillable > 0) {
                    System.arraycopy(lines, beginSourceIndex, copyLines,
                            currentIndexCopyLines,
                            countLinesNotNillable);
                    currentIndexCopyLines += countLinesNotNillable;
                    beginSourceIndex = 0;
                    countLinesNotNillable = 0;
                }
            }
            printArr(copyLines);
        }
    }

    private static void printArr(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printArr(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length / 2 + 1) {
                System.out.println();
            }
            System.out.printf("%6.3f", numbers[i]);
        }
        System.out.println();
    }

    private static void printArr(String[] lines) {
        System.out.printf("|");
        for (String line : lines) {
            System.out.printf("%4s|", line);
        }

        System.out.println();
    }

    private static int generateRandomNum(int min, int max) {
        return (int) (min + (Math.random() * (max - min)));
    }

    private static boolean checkUniqueNum(int[] numbers,
                                          int checknum) {
        for (int num : numbers) {
            if (num == checknum) {
                return false;
            }
        }
        return true;
    }

}
