package lab1.task3;

public class Numbers {

    public static String[] hundreds = {null, "Сто ", "Двести ", "Триста ", "Четыреста ", "Пятьсот ", "Шестьсот ", "Семьсот ", "Восемьсот ", "Девятьсот "};
    public static String[] tens = {null, "десять ", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "};
    public static String[] units = {null, "один", "два", "три ", "четыре", "пять", "шесть", "семь", "весемь ", "девять"};
    public static String[] otherDigits = {null, "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};

    /**
     * This method converting number to string representation
     * @param number - Integer value of needed number
     * @return String representation of the number
     */
    public static String numberToString(int number) {
        StringBuilder answere = new StringBuilder();
        if (number < 100 || number > 999) {
            return "Неверный ввод! Введите число от 100 до 999! ";
        }
        String[] arr = String.valueOf(number).split("");

        for (int i = 0; i < arr.length; i++) {

            //
            //Обработка чисел от 11 до 19
            //
            if (i == 1 && arr[1].equals("1")) {
                if (arr[2].equals("1")) {
                    answere.append(otherDigits[1]);
                }
                if (arr[2].equals("2")) {
                    answere.append(otherDigits[2]);
                }
                if (arr[2].equals("3")) {
                    answere.append(otherDigits[3]);
                }
                if (arr[2].equals("4")) {
                    answere.append(otherDigits[4]);
                }
                if (arr[2].equals("5")) {
                    answere.append(otherDigits[5]);
                }
                if (arr[2].equals("6")) {
                    answere.append(otherDigits[6]);
                }
                if (arr[2].equals("7")) {
                    answere.append(otherDigits[7]);
                }
                if (arr[2].equals("8")) {
                    answere.append(otherDigits[8]);
                }
                if (arr[2].equals("9")) {
                    answere.append(otherDigits[9]);
                }
                break;
            }

            switch (arr[i]) {
                case "1": {
                    if (i == 0) {
                        answere.append(hundreds[1]);
                    }
                    if (i == 1) {
                        answere.append(tens[1]);
                    }
                    if (i == 2) {
                        answere.append(units[1]);
                    }
                    break;
                }
                case "2": {
                    if (i == 0) {
                        answere.append(hundreds[2]);
                    }
                    if (i == 1) {
                        answere.append(tens[2]);
                    }
                    if (i == 2) {
                        answere.append(units[2]);
                    }
                    break;
                }
                case "3": {
                    if (i == 0) {
                        answere.append(hundreds[3]);
                    }
                    if (i == 1) {
                        answere.append(tens[3]);
                    }
                    if (i == 2) {
                        answere.append(units[3]);
                    }
                    break;
                }
                case "4": {
                    if (i == 0) {
                        answere.append(hundreds[4]);
                    }
                    if (i == 1) {
                        answere.append(tens[4]);
                    }
                    if (i == 2) {
                        answere.append(units[4]);
                    }
                    break;
                }
                case "5": {
                    if (i == 0) {
                        answere.append(hundreds[5]);
                    }
                    if (i == 1) {
                        answere.append(tens[5]);
                    }
                    if (i == 2) {
                        answere.append(units[5]);
                    }
                    break;
                }
                case "6": {
                    if (i == 0) {
                        answere.append(hundreds[6]);
                    }
                    if (i == 1) {
                        answere.append(tens[6]);
                    }
                    if (i == 2) {
                        answere.append(units[6]);
                    }
                    break;
                }
                case "7": {
                    if (i == 0) {
                        answere.append(hundreds[7]);
                    }
                    if (i == 1) {
                        answere.append(tens[7]);
                    }
                    if (i == 2) {
                        answere.append(units[7]);
                    }
                    break;
                }
                case "8": {
                    if (i == 0) {
                        answere.append(hundreds[8]);
                    }
                    if (i == 1) {
                        answere.append(tens[8]);
                    }
                    if (i == 2) {
                        answere.append(units[8]);
                    }
                    break;
                }
                case "9": {
                    if (i == 0) {
                        answere.append(hundreds[9]);
                    }
                    if (i == 1) {
                        answere.append(tens[9]);
                    }
                    if (i == 2) {
                        answere.append(units[9]);
                    }
                    break;
                }
            }
        }
        return answere.toString();
    }
}
