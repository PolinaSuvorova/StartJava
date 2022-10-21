package com.lesson_4;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Реверс значений массива");
        int[] numbersArray = {5, 4, 6, 3, 1, 2, 7};
        int indexElement = numbersArray.length - 1;

        printArray(numbersArray);
        for (int i = 0; i < (numbersArray.length - 1) / 2; i++) {
            int localElement = numbersArray[i];
            numbersArray[i] = numbersArray[indexElement];
            numbersArray[indexElement] = localElement;
            indexElement--;
        }
        printArray(numbersArray);


    }

    private static void printArray(int[] numbersArray) {
        for (int number : numbersArray) {
            System.out.print(number + " ");
        }
    }
}
