package lab3.task2;

import java.util.ArrayList;
import java.util.List;

public class BelarusInfo {

    public static String formatMoney(int moneyValue) {
        String answere = null;
        if (moneyValue < 0) {
            System.out.println("Invalid value!");
            return null;
        }
        if ((moneyValue % 10) == 1) {
            answere =  moneyValue + "рубль";
        } else if ((moneyValue % 10) < 5) {
            answere = moneyValue + "рубля";
        } else if ((moneyValue % 10) > 4) {
            answere = moneyValue + "рублей";
        }
        return answere;
    }

    public static String isLeapYear(int year) {
        if (year < 0) {
            System.out.println("Invalid value!");
            return null;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return "Это высокосный год!";
        } else {
            return "Это не высокосный год!";
        }
    }

    public static <T> ArrayList linearizeArray(T[][] originArray) {
        ArrayList<T> array = new ArrayList<>();
        for (T[] loop2 : originArray) {
            for (T value : loop2) {
                array.add(value);
            }
        }
        return array;
    }
}
