package lab9.task3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MySet {
    private static Set<Integer> set;
    private static Random random;

    static {
        set = new HashSet<>();
        random = new Random();
    }

    public static void execute() {
        for (int i = 0; i < 50; i++) {
            set.add(random.nextInt(100));
        }
    }

    public static void show() {
        for (Integer iter: set) {
            System.out.println(iter);
        }
    }


}
