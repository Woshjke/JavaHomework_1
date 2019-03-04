package lab4.task3;

public class Task3 {
    /**
     * Посчитать количество «троек» (тройка – три идущих подряд одинаковых символа) в строке.
     * Обратить внимание что может быть пересечение.
     *
     * @param str - строка
     */
    public static void task3(String str) {
        int counter = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == array[i + 1] && array[i] == array[i + 2]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
