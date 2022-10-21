package com.lesson_4;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Реверс значений массива");
        int[] numbersArray = {5, 4, 6, 3, 1, 2, 7};
        int indexElement = numbersArray.length - 1;
        printArray(numbersArray);
        for (int i = 0; i < (numbersArray.length) / 2; i++) {
            int localElement = numbersArray[i];
            numbersArray[i] = numbersArray[indexElement];
            numbersArray[indexElement] = localElement;
            indexElement--;
        }
        printArray(numbersArray);

        System.out.println("\n2. Вывод произведения элементов массива");
        numbersArray = new int[10];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = i;
        }
        int multiplicationNumber = 1;
        for (int i = 1; i < numbersArray.length - 1; i++) {
            multiplicationNumber *= numbersArray[i];
            System.out.print(numbersArray[i] + (i != numbersArray.length - 2 ?
                    " * " : " = " + multiplicationNumber + "\n"));
        }
        System.out.println(numbersArray[0] + " " + numbersArray[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] randomNumbers = new double[15];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = generateRandomNumber();
        }
        System.out.println("Исходный массив:");
        printArray(randomNumbers);
        double midleArrayNumber = randomNumbers[randomNumbers.length / 2];
        int countNilableNumber = 0;
        System.out.printf("Число из середины массива: %6.3f", midleArrayNumber);
        System.out.println();
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > midleArrayNumber) {
                randomNumbers[i] = 0;
                countNilableNumber++;
            }
        }
        printArray(randomNumbers);
        System.out.println("Всего обнулённых значений: " + countNilableNumber);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] lettersArray = new char[26];
        char letter = 'A';
        for (int i = 0; i < lettersArray.length; i++) {
            lettersArray[i] = letter;
            letter++;
        }
        for (int i = lettersArray.length - 1; i >= 0; i--) {
            for (int j = lettersArray.length - 1; j >= i; j--) {
                System.out.print(lettersArray[j]);
            }
            System.out.println();
        }

        System.out.println("5. Генерация уникальных чисел");
        numbersArray = new int[30];
        for (int i = 0; i < numbersArray.length; i++) {
            int randomNum;
            do {
                randomNum = generateRandomNumber(60, 100);
            } while (!checkUniqueNumber(numbersArray, randomNum));
            numbersArray[i] = randomNum;
        }
        Arrays.sort(numbersArray);
        for (int i = 0; i < numbersArray.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%4d", numbersArray[i]);
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
        printArray(lines);

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
                    System.arraycopy(lines, beginSourceIndex, copyLines, currentIndexCopyLines,
                            countLinesNotNillable);
                    currentIndexCopyLines += countLinesNotNillable;
                    beginSourceIndex = 0;
                    countLinesNotNillable = 0;
                }
            }
            printArray(copyLines);
        }
    }

    private static void printArray(int[] numbersArray) {
        for (int number : numbersArray
        ) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void printArray(double[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            if (i == numbersArray.length / 2 + 1) {
                System.out.println();
            }
            System.out.printf("%6.3f", numbersArray[i]);
        }
        System.out.println();
    }

    private static void printArray(String[] linesArray) {
        System.out.printf("|");
        for (int i = 0; i < linesArray.length; i++) {
            System.out.printf("%4s|", linesArray[i]);
        }

        System.out.println();
    }

    private static double generateRandomNumber() {
        int intNumber = (int) (Math.random() * 1000);
        double doubleNumber = intNumber;
        doubleNumber /= 1000;
        return doubleNumber;
    }

    private static int generateRandomNumber(int min, int max) {
        return (int) (min + (Math.random() * (max - min)));
    }

    private static boolean checkUniqueNumber(int[] numbersArray,
                                             int checkNumber) {
        for (int number : numbersArray) {
            if (number == checkNumber) {
                return false;
            }
        }
        return true;
    }

}
