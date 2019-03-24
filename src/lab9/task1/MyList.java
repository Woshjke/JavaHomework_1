package lab9.task1;

import java.util.*;

public class MyList {
    private static Random random;
    private static ArrayList<Integer> arr;

    static {
        arr = new ArrayList<>();
        random = new Random();
    }

    public static void create() {
        for (int i = 0; i < 15; i++) {
            arr.add(random.nextInt(50));
        }
    }

    public static ArrayList<Integer> task1() {
        return new ArrayList<>(arr.subList(2, 8));
    }

    public static void task2() {
        Set<Integer> set = new HashSet<>(arr);
        set.forEach(System.out::println);
    }

    public static void task3() {
        int counter = 0;
        Set<Integer> set = new HashSet<>(arr);
        for (int i = 0; i < set.size(); i++) {
            counter++;
        }
        System.out.println("Num of uniq: " + counter);
    }

    public static void task4() {
        arr.sort(Integer::compareTo);
    }

    public static void task5() {
        Integer min = arr.get(0);
        Integer max = arr.get(0);
        Integer sum = 0;
        for (Integer iter : arr) {
            if (iter < min) {
                min = iter;
            }
            if (iter > max) {
                max = iter;
            }
            sum += iter;
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("sum: " + sum);
    }

    public static void task7() {
        ArrayList<Integer> index = new ArrayList<>();
        for (Integer iter : arr) {
            if (iter % 2 != 0) {
                index.add(arr.indexOf(iter));
            }
        }

        for (Integer iter : index) {
            arr.remove(iter);
        }
    }

    public static void task8(int num) {
        ArrayList<Integer> index = new ArrayList<>();
        for (Integer iter : arr) {
            if (iter == num) {
                index.add(arr.indexOf(iter));
            }
        }

        for (Integer iter : index) {
            arr.remove(iter);
        }
    }


}
