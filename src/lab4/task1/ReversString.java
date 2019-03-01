package lab4.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversString {

    public static void isPalindrome(String originString) {
        List<String> list = Arrays.asList(originString.split(" "));
        StringBuilder tempStr;
        double palindromeCount = 0;

        for (String iter : list) {
            tempStr = new StringBuilder(iter);
            
            if (iter.equals(tempStr.reverse().toString())) {
                palindromeCount++;
            }
        }

        System.out.println("Количество палиндромов: " + palindromeCount + "\nПроцент палиндромов: " + (palindromeCount / list.size() * 100));
    }
}
