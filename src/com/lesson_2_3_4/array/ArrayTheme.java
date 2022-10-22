package com.lesson_2_3_4.array;

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
        len = randomNums.length;
        for (int i = 0; i < len; i++) {
            randomNums[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printArr(randomNums);
        double midleArrNum = randomNums[len / 2];
        int countNilableNum = 0;
        System.out.printf("Число из середины массива: %6.3f\n", midleArrNum);
        for (int i = 0; i < len; i++) {
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
        len = lettersArr.length;
        for (int i = 0; i < len; i++, letter++) {
            lettersArr[i] = letter;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(lettersArr[j]);
            }
            System.out.println();
        }

        System.out.println("5. Генерация уникальных чисел");
        numsArr = new int[30];
        len = numsArr.length;
        for (int i = 0; i < len; i++) {
            int randomNum;
            do {
                randomNum = generateRandomNum(60, 100);
            } while (!checkUniqueNum(numsArr, randomNum));
            numsArr[i] = randomNum;
        }
        Arrays.sort(numsArr);
        for (int i = 0; i < len; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%4d", numsArr[i]);
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] lines = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countLinesNotBlank = 0;
        for (String line : lines) {
            if (!line.isBlank()) {
                countLinesNotBlank++;
            }
        }
        printArr(lines);
        if (countLinesNotBlank != 0) {
            String[] copyLines = new String[countLinesNotBlank];
            countLinesNotBlank = 0;
            int beginSrcIndex = 0;
            int indexCopyLines = 0;
            for (int i = 0; i < lines.length; i++) {
                if (!lines[i].isBlank()) {
                    countLinesNotBlank++;
                    if (beginSrcIndex == 0) {
                        beginSrcIndex = i;
                    }
                } else if (countLinesNotBlank > 0) {
                    System.arraycopy(lines, beginSrcIndex, copyLines, indexCopyLines,
                            countLinesNotBlank);
                    indexCopyLines += countLinesNotBlank;
                    beginSrcIndex = 0;
                    countLinesNotBlank = 0;
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
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            if (i == len / 2 + 1) {
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

    private static boolean checkUniqueNum(int[] numbers, int checknum) {
        for (int num : numbers) {
            if (num == checknum) {
                return false;
            }
        }
        return true;
    }

}