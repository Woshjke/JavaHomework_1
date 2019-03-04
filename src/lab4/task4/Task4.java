package lab4.task4;

import java.util.Arrays;

public class Task4 {
    /**
     * В веденной строке с клавиатуры поменять слова местами (первое с последним, второе с предпоследним и т.д.).
     * Слова имеют разную длину.
     *
     * @param str - строка
     */
    public static void swapElements(String str) {
        String[] array = str.split(" ");
        String[] outputArray = Arrays.copyOf(array, array.length);
        int indexOfLastElement = array.length - 1;
        int indexOfMiddle = array.length / 2;

        for (int i = 0; i < indexOfMiddle; i++) {
            outputArray[i] = array[indexOfLastElement - i];
            outputArray[indexOfLastElement - i] = array[i];
        }

        System.out.println(Arrays.toString(outputArray));
    }
}
