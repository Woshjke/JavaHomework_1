package lab4.task5;

import java.util.Map;
import java.util.TreeMap;

public class Task5 {
    /**
     * Строка состоит из слов. Слова – это цифры.
     * Сформировать новую строку, где слова будут упорядочены по сумме цифр её образующих.
     *
     * @param str - строка
     */
    public static String customSort(String str) {
        String[] arrOfNums = str.split("\\D+");
        Integer[] arrOfSums = new Integer[arrOfNums.length];
        StringBuilder outputString = new StringBuilder();

        //Разбиваю каждое число на цифры и суммирую их
        for (int i = 0; i < arrOfNums.length; i++) {
            int temp = 0;
            String[] tempArray = arrOfNums[i].split("");
            for (String iter : tempArray) {
                temp += Integer.parseInt(iter);
            }
            arrOfSums[i] = temp;
        }

        //Создаем дерево, где ключ - это сумма цифер числа, а значение - само число.
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < arrOfNums.length; i++) {
            map.put(arrOfSums[i], arrOfNums[i]);
        }

        //Так как в дереве все элементы отсортированны, то просто формируем новую строку, проходясь по значениям дерева.
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            outputString.append(entry.getValue() + " ");
        }

        return outputString.toString();
    }
}
