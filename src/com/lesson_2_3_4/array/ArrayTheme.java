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
        double middleArrNum = randomNums[len / 2];
        int countNillableNum = 0;
        System.out.printf("Число из середины массива: %6.3f\n", middleArrNum);
        for (int i = 0; i < len; i++) {
            if (randomNums[i] > middleArrNum) {
                randomNums[i] = 0;
                countNillableNum++;
            }
        }
        printArr(randomNums);
        System.out.println("Всего обнулённых значений: " + countNillableNum);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] abc = new char[26];
        char letter = 'A';
        len = abc.length;
        for (int i = 0; i < len; i++, letter++) {
            abc[i] = letter;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(abc[j]);
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
        String[] srcArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int lenght = 0;
        for (String line : srcArr) {
            if (!line.isBlank()) {
                lenght++;
            }
        }
        printArr(srcArr);
        if (lenght != 0) {
            String[] destArr = new String[lenght];
            lenght = 0;
            int srcPos = 0;
            int destPos = 0;
            for (int i = 0; i < srcArr.length; i++) {
                if (!srcArr[i].isBlank()) {
                    lenght++;
                    if (srcPos == 0) {
                        srcPos = i;
                    }
                } else if (lenght > 0) {
                    System.arraycopy(srcArr, srcPos, destArr, destPos,
                            lenght);
                    destPos += lenght;
                    srcPos = 0;
                    lenght = 0;
                }
            }
            printArr(destArr);
        }
    }

    private static void printArr(int[] numbs) {
        for (int num : numbs) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printArr(double[] numbs) {
        int len = numbs.length;
        for (int i = 0; i < len; i++) {
            if (i == len / 2 + 1) {
                System.out.println();
            }
            System.out.printf("%6.3f", numbs[i]);
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

    private static boolean checkUniqueNum(int[] numbs, int checknum) {
        for (int num : numbs) {
            if (num == checknum) {
                return false;
            }
        }
        return true;
    }

}
