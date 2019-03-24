package lab9.task6;

import java.util.ArrayList;
import java.util.Random;

public class MyList {
    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private static Random rand = new Random();
    
    public static void create() {
        int x_size = rand.nextInt(10) + 1;
        for (int i = 0; i < x_size; i++) {
            arrayList.add(rand.nextInt(20) + 1);
        }

        arrayList.set(rand.nextInt(20), 0);
        arrayList.set(rand.nextInt(20), 0);
    }
}
