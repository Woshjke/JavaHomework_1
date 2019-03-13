package lab6.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    /**
     * Создать любую коллекцию (или массив) объектов Стринг.
     * Некоторые элементы должны быть равны null.
     * Вывести список хэшкодов этих элементов.
     * Отловить ситуацию, когда элемент null и вывести уведомление об этом в консоль. И продолжить прохождение по циклу.
     */
    public static void execute() {
        int i = 0;
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add(null);
        list.add("asd");

        while (i != list.size()) {
            try {
                for (; i < list.size(); i++) {
                    System.out.println(list.get(i).hashCode());
                }
            } catch (Exception e) {
                System.out.println("Exception");
                i++;
            }
        }
    }
}
