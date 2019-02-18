package task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Введите число в диапазоне от 100 до 999: ");
        number = scanner.nextInt();
        String answere = numberToString(number);
        System.out.println(answere);
    }

    private static String[] firstDigits = {null, "Сто ", "Двести ", "Триста ", "Четыреста ", "Пятьсот ", "Шестьсот ", "Семьсот ", "Восемьсот ", "Девятьсот "};
    private static String[] secondDigits = {null, "десять ", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "};
    private static String[] thirdDigits = {null, "один", "два", "три ", "четыре", "пять", "шесть", "семь", "весемь ", "девять"};
    private static String[] otherDigits = {null, "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};

    private static String numberToString(int number) {
        StringBuilder answere = new StringBuilder();
        if (number < 100 || number > 999) {
            return "Неверный ввод!";
        }
        String[] arr = String.valueOf(number).split("");

        for (int i = 0; i < arr.length; i++) {

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
                        answere.append(firstDigits[1]);
                    }
                    if (i == 1) {
                        answere.append(secondDigits[1]);
                    }
                    if (i == 2) {
                        answere.append(thirdDigits[1]);
                    }
                    break;
                }
                case "2": {
                    if (i == 0) {
                        answere.append(firstDigits[2]);
                    }
                    if (i == 1) {
                        answere.append(secondDigits[2]);
                    }
                    if (i == 2) {
                        answere.append(thirdDigits[2]);
                    }
                    break;
                }
                case "3": {
                    if (i == 0) {
                        answere.append(firstDigits[3]);
                    }
                    if (i == 1) {
                        answere.append(secondDigits[3]);
                    }
                    if (i == 2) {
                        answere.append(thirdDigits[3]);
                    }
                    break;
                }
                case "4": {
                    if (i == 0) {
                        answere.append(firstDigits[4]);
                    }
                    if (i == 1) {
                        answere.append(secondDigits[4]);
                    }
                    if (i == 2) {
                        answere.append(thirdDigits[4]);
                    }
                    break;
                }
                case "5": {
                    if (i == 0) {
                        answere.append(firstDigits[5]);
                    }
                    if (i == 1) {
                        answere.append(secondDigits[5]);
                    }
                    if (i == 2) {
                        answere.append(thirdDigits[5]);
                    }
                    break;
                }
                case "6": {
                    if (i == 0) {
                        answere.append(firstDigits[6]);
                    }
                    if (i == 1) {
                        answere.append(secondDigits[6]);
                    }
                    if (i == 2) {
                        answere.append(thirdDigits[6]);
                    }
                    break;
                }
                case "7": {
                    if (i == 0) {
                        answere.append(firstDigits[7]);
                    }
                    if (i == 1) {
                        answere.append(secondDigits[7]);
                    }
                    if (i == 2) {
                        answere.append(thirdDigits[7]);
                    }
                    break;
                }
                case "8": {
                    if (i == 0) {
                        answere.append(firstDigits[8]);
                    }
                    if (i == 1) {
                        answere.append(secondDigits[8]);
                    }
                    if (i == 2) {
                        answere.append(thirdDigits[8]);
                    }
                    break;
                }
                case "9": {
                    if (i == 0) {
                        answere.append(firstDigits[9]);
                    }
                    if (i == 1) {
                        answere.append(secondDigits[9]);
                    }
                    if (i == 2) {
                        answere.append(thirdDigits[9]);
                    }
                    break;
                }
            }
        }
        return answere.toString();
    }
}
