public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Создание переменных и вывод их значений на консоль (это название задачи)");
        boolean sumTypeBoolean = true;
        byte sumTypeByte = 127;
        int sumTypeInt = 100;
        short sumTypeShort = 11;
        long sumTypeLong = 2100100100L;
        char textTypeChar = 1065;
        float sumTypeFloat = 2.335F;
        double sumTypeDouble = 2.33;
        System.out.println("Элементарные типы:\n" +
                Boolean.TYPE + " " + sumTypeBoolean + "\n" +
                Byte.TYPE + " " + sumTypeByte + "\n" +
                Integer.TYPE + " " + sumTypeInt + "\n" +
                Short.TYPE + " " + sumTypeShort + "\n" +
                Long.TYPE + " " + sumTypeLong +
                "\nChar " + textTypeChar + "\n" +
                Float.TYPE + " " + sumTypeFloat + "\n" +
                Double.TYPE + " " + sumTypeDouble);
        double cpuFrequency = 2.40;
        int cores = 2;
        double romSize = 128.00;
        double ramSize = 8.00;

        System.out.println("\n\tЧастота процессора " + cpuFrequency + "GHz");
        System.out.println("\tоперативная память " + ramSize + "GB");
        System.out.println("\tпостоянная память " + romSize + "GB");
        System.out.println("\tКолличество ядер " + cores);

        System.out.println("\n 2. Расчет стоимости товара со скидкой");
        double pricePen = 100.0;
        double priceBook = 200.0;
        short discountPersent = 11;
        double totalCost = priceBook + pricePen;
        double discountPrice = totalCost * discountPersent / 100.0;
        double totalCostWithdiscount = totalCost - discountPrice;
        System.out.println("\tСумма скидки: " + discountPrice + "\n\t" +
                "Всего цена со скидкой: " + totalCostWithdiscount);

        System.out.println("\n 3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a" + "\n   J   a a  v   v  a " +
                "a" + "\nJ  J  aaaaa " + " " + "V V  aaaaa" +
                "\n JJ  a     a  V  a     a");

        System.out.println("\n 4. Отображение min и max значений числовых типов данных");
        byte byteMax = 127;
        int intMax = Integer.MAX_VALUE;
        short shortMax = 32767;
        long longMax = Long.MAX_VALUE;
        System.out.println("первоначальное значение:");
        System.out.printf("\t %s = %d", Byte.TYPE, byteMax);
        System.out.printf("\n\t %s = %d", Short.TYPE, shortMax);
        System.out.printf("\n\t %s = %d", Integer.TYPE, intMax);
        System.out.printf("\n\t %s = %d", Long.TYPE, longMax);
        System.out.println("\nзначение после инкремента:");
        System.out.printf("\t %s = %d", Byte.TYPE, ++byteMax);
        System.out.printf("\n\t %s = %d", Short.TYPE, ++shortMax);
        System.out.printf("\n\t %s = %d", Integer.TYPE, ++intMax);
        System.out.printf("\n\t %s = %d", Long.TYPE, ++longMax);
        System.out.println("\nзначение после декремента:");
        System.out.printf("\t %s = %d", Byte.TYPE, --byteMax);
        System.out.printf("\n\t %s = %d", Short.TYPE, --shortMax);
        System.out.printf("\n\t %s = %d", Integer.TYPE, --intMax);
        System.out.printf("\n\t %s = %d", Long.TYPE, --longMax);

        System.out.println("\n\n5. Перестановка значений переменных");
        int number1 = 5;
        int number2 = 2;
        System.out.println("\tИсходное значение: var1 = " + number1 +
                " var2 = " + number2);
        int number3 = number1;
        number1 = number2;
        number2 = number3;
        System.out.println("\t\t перестановка с помощью третьей переменной: var1 = " +
                number1 + " var2 = " + number2);
        System.out.println("\tИсходное значение: var1 = " + number1 +
                " var2 = " + number2);
        number1 += number2; // 2 + 5 = 7
        number2 = number1 - number2; // 7 - 5 = 2
        number1 = number1 - number2; // 7 + 3 = 5
        System.out.println("\t\t с помощью арифметических операций: var1 = " +
                number1 + " var2 = " + number2);
        System.out.println("\tИсходное значение: var1 = " + number1 + " var2 = "
                + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println("\t\t с помощью побитовой операции: var1 = " + number1 +
                " var2= " + number2);

        System.out.println("6. Вывод символов и их кодов");
        System.out.println("\t Код " + 35 + " символ " + (char) 35);
        System.out.println("\t Код " + 38 + " символ " + (char) 38);
        System.out.println("\t Код " + 64 + " символ " + (char) 64);
        System.out.println("\t Код " + 94 + " символ " + (char) 94);
        System.out.println("\t Код " + 95 + " символ " + (char) 95);

        System.out.println("7. Вывод на консоль ASCII-арт Дюка");
        char space = ' ';
        char slash = '/';
        char backSlash = '\\';
        char underLine = '_';
        char bracket = '(';
        char backBracket = ')';
        System.out.printf("%s%s%s%s%s%s%s%s%s%s",
                space, space, space, space, slash, backSlash, space,
                space, space, space);
        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s", space, space, space, slash,
                space, space, backSlash, space, space, space);
        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s", space, space, slash,
                underLine, bracket, space, backBracket, backSlash, space, space);
        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s", space, slash, space, space,
                space, space, space, space, backSlash, space);
        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s", slash, underLine, underLine,
                underLine, underLine, slash, backSlash, underLine, underLine,
                backSlash);

        System.out.println("\n8. Произведение и сумма цифр числа");
        int srcNum = 345;
        int sumDigits = srcNum / 100 + srcNum % 10 + srcNum % 100 / 10;
        int prodDigits = srcNum / 100 * (srcNum % 10) * (srcNum % 100 / 10);
        System.out.printf("\t сумма цифр числа %d = %d ", srcNum, sumDigits);
        System.out.printf("\n\t произведение цифр числа %d = %d ", srcNum, prodDigits);

        System.out.println("\n9. Преобразование секунд");
        int allSeconds = 86399;
        int hour = allSeconds / 3600;
        int minute = allSeconds % 3600 / 60;
        int second = allSeconds % 60;
        System.out.printf("\t Время %d:%d:%d ", hour, minute, second);
    }
}