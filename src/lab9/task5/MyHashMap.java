package lab9.task5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MyHashMap {
    private static HashMap<Integer, ArrayList<Integer>> myMap;
    private static Random rand;
    private static ArrayList<Integer> arrayList;

    static {
        myMap = new HashMap<>();
        rand = new Random();
    }

    public static void create() {
        ArrayList<Integer> arrayList;
        for (int key = 0; key < 10; key++) {
            int randomSize = rand.nextInt(10) + 1;
            arrayList = new ArrayList<>();
            for (int i = 0; i < randomSize; i++) {
                arrayList.add(rand.nextInt(10));
            }
            myMap.put(key, arrayList);
        }
    }

    public static void show() {
        for (Integer iter : myMap.keySet()) {
            ArrayList<Integer> arr;
            arr = myMap.get(iter);
            for (Integer integer : arr) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
