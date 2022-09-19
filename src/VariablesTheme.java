public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Создание переменных и вывод их значений на консоль (это название задачи)");
        boolean varBoolean = true;
        byte varByte = 127;
        int varInt = 100;
        short varShort = Short.MIN_VALUE;
        long varLong = 2100100100L;
        char varChar = 1065;
        float varFloat = 2.335F;
        double varDouble = 2.33;
        System.out.println("Элементарные типы:\n" + Boolean.TYPE + " " + varBoolean + "\n" +
                Byte.TYPE + " " + varByte + "\n" + Integer.TYPE + " " + varInt + "\n" +
                Short.TYPE + " " + varShort + "\n" + Long.TYPE + " " + varLong + "\nChar " +
                varChar + "\n" + Float.TYPE + " " + varFloat + "\n" + Double.TYPE + " " + varDouble);
        int availableProcessors = 3;
        double randomAccessMemory = 8.00;
        System.out.println("\n\tКоличество доступных процессоров " + availableProcessors);
        System.out.println("\tВсего памяти " + randomAccessMemory);

        System.out.println("\n 2. Расчет стоимости товара со скидкой");
        double pricePen = 100.0;
        double priceBook = 200.0;
        short discountPersent = 11;
        double totalCost = priceBook + pricePen;
        totalCost = totalCost - totalCost * discountPersent / 100.0;
        System.out.println("\tСумма скидки: " + varInt + "\n\tВсего цена со скидкой: " + totalCost);

        System.out.println("\n 3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a" + "\n   J   a a  v   v  a a" + "\nJ  J  aaaaa " +
                " " + "V V  aaaaa" + "\n JJ  a     a  V  a     a");

        System.out.println("\n 4. Отображение min и max значений числовых типов данных");
        byte byteMax = 127;
        int intMax = Integer.MAX_VALUE;
        short shortMax = 32767;
        long longMax = Long.MAX_VALUE;
        System.out.println("первоначальное значение:");
        System.out.printf("\n\t %s = %d", Byte.TYPE, byteMax );
        System.out.printf("\n\t %s = %d", Short.TYPE, shortMax );
        System.out.printf("\n\t %s = %d", Integer.TYPE, intMax );
        System.out.printf("\n\t %s = %d", Long.TYPE, longMax );
        System.out.println("\nзначение после инкремента:");
        System.out.printf("\n\t %s = %d", Byte.TYPE, ++byteMax );
        System.out.printf("\n\t %s = %d", Short.TYPE, ++shortMax );
        System.out.printf("\n\t %s = %d", Integer.TYPE, ++intMax );
        System.out.printf("\n\t %s = %d", Long.TYPE, ++longMax );
        System.out.println("\nзначение после декремента:");
        System.out.printf("\n\t %s = %d", Byte.TYPE, byteMax-- );
        System.out.printf("\n\t %s = %d", Short.TYPE, shortMax-- );
        System.out.printf("\n\t %s = %d", Integer.TYPE, intMax-- );
        System.out.printf("\n\t %s = %d", Long.TYPE, longMax-- );
        System.out.println("\n\n5. Перестановка значений переменных");
        int var1 = 5;
        int var2 = 2;
        System.out.println("\tИсходное значение: var1 = " + var1 + " var2 = " + var2);
        int var3 = var1;
        var1 = var2;
        var2 = var3;
        System.out.println("\t\t перестановка с помощью третьей переменной: var1 = " + var1 +
                " var2 = " + var2);
        System.out.println("\tИсходное значение: var1 = " + var1 + " var2 = " + var2);
        var1 += var2; // 2 + 5 = 7
        var2  = var1 - var2; // 7 - 5 = 2
        var1  = var1 - var2; // 7 + 3 = 5
        System.out.println("\t\t с помощью арифметических операций: var1 = " + var1 +
                " var2 = " + var2);
        System.out.println("\tИсходное значение: var1 = " + var1 + " var2 = " + var2);
        var1 ^= var2;
        var2 ^= var1;
        var1 ^= var2;
        System.out.println("\t\t с помощью побитовой операции: var1 = " + var1 + " var2= " + var2);

        System.out.println("6. Вывод символов и их кодов");
        int[] arrayASCII = new int[]{35, 38, 64, 94, 95};
        for (int j : arrayASCII) {
            System.out.println("\t Код " + j + " символ " + (char) j);
        }

        System.out.println("7. Вывод на консоль ASCII-арт Дюка");
        char constSpace = ' ';
        char constSlash1 = '/';
        char constSlash2 = '\\';
        char constLine = '_';
        char constSkobka = '(';
        char constSkobka2 = ')';
        System.out.printf("%s%s%s%s%s%s%s%s%s%s",
                constSpace , constSpace , constSpace , constSpace , constSlash1 ,
                constSlash2 , constSpace , constSpace , constSpace , constSpace);
        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s",constSpace, constSpace, constSpace, constSlash1,
                constSpace, constSpace, constSlash2, constSpace, constSpace, constSpace);
        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s",constSpace, constSpace, constSlash1, constLine,
                constSkobka,constSpace, constSkobka2, constSlash2, constSpace, constSpace);
        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s",constSpace, constSlash1, constSpace, constSpace,
                constSpace, constSpace, constSpace, constSpace, constSlash2, constSpace);
        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s",constSlash1, constLine, constLine, constLine,
                constLine, constSlash1, constSlash2, constLine, constLine, constSlash2);


        System.out.println("\n8. Произведение и сумма цифр числа");
        int val345 = 345;
        int valSumma = val345 / 100 + val345 % 10 + val345 % 100 / 10;
        int valProizv = val345 / 100 * (val345 % 10) * (val345 % 100 / 10);
        System.out.printf("\t сумма цифр числа %d = %d ", val345, valSumma);
        System.out.printf("\n\t произведение цифр числа %d = %d ", val345, valProizv);
        System.out.println("\n 9. Преобразование секунд");
        int allSeconds = 86399;
        int hour = allSeconds / 3600;
        int minute = allSeconds % 3600 / 60;
        int second = allSeconds % 3600 % 60;
        System.out.printf("\t Время %d:%d:%d ", hour, minute, second);
    }
}