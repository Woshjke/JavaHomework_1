package lab9.task2;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    private static Map<String, Integer> map = new HashMap<>();

    public static void execute(String string) {
        System.out.println("Given string: " + string);
        String[] chars = string.replaceAll("[^a-zA-Z]", "").split("");
        for (String iter : chars) {
            map.merge(iter, 1, (oldVal, newVal) -> oldVal + newVal);
        }
        System.out.println(map.toString());
    }
}
