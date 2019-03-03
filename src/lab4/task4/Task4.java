package lab4.task4;

import jdk.jfr.Unsigned;

import java.util.Arrays;

public class Task4 {
    public static void task4(String str) {
        String[] array = str.split(" ");
        String[] outputArray = new String[array.length];
        int lastIndex = array.length - 1;

        int halfOfArray = array.length / 2;

        for (int i = 0; i < array.length; i++) {
            outputArray[i] = array[lastIndex - i];
        }

        System.out.println(Arrays.toString(outputArray));
    }
}
