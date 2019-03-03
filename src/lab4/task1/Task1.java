package lab4.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void isPalindrome(String originString) {
        String[] array = originString.split(" ");
        StringBuilder tempStr;
        double palindromeCount = 0;

        for (String iter : array) {
            tempStr = new StringBuilder(iter);

            if (iter.equals(tempStr.reverse().toString())) {
                palindromeCount++;
            }
        }

        System.out.println("Количество палиндромов: " + palindromeCount + "\nПроцент палиндромов: " + (palindromeCount / array.length * 100));
    }
}
