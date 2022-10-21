package com.lesson_4;

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
                    " * " : " = " +  multiplicationNumber + "\n"));
        }
        System.out.println( numbersArray[0] + " " + numbersArray[9] );


    }

    private static void printArray(int[] numbersArray) {
        for (int number : numbersArray
        ) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
