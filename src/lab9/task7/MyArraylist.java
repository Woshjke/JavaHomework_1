package lab9.task7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MyArraylist {
    private static ArrayList<Integer> arr = new ArrayList<>();
    private static Iterator iter;

    public static void create() {
        Random random = new Random();
        int size = random.nextInt(20);
        for (int i = 0; i < size; i++) {
            arr.add(new Random().nextInt(10));
        }
        iter = arr.iterator();
    }

    public static void show() {
        if (iter.hasNext()) {
            System.out.print(iter.next().toString() + " ");
            show();
        }
    }
}
