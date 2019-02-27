package lab2;

import java.util.*;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        task6(6, 6);
    }

    private static void task1() {
        Integer[] arr = new Integer[100];
        int countOfNums = 0;
        int number = 0;

        while (countOfNums < 100) {
            if (number % 13 == 0 || number % 17 == 0) {
                arr[countOfNums] = number;
                countOfNums++;
            }
            number++;
        }

        for (Integer a : arr) {
            System.out.println(a);
        }
    }

    private static void task2(int arraySize, int bound) {
        List<Integer> arr = new ArrayList<>();
        Random random = new Random();
        int sum = 0;

        //заполнение массива
        for (int i = 0; i < arraySize; i++) {
            arr.add(random.nextInt(bound));
        }

        Integer minNum = Integer.MAX_VALUE;
        Integer maxNum = 0;

        //Прохождение по коллекции для значений мксимального и минимального элементов
        for (Integer num : arr) {
            if (num < minNum) minNum = num;
            if (num > maxNum) maxNum = num;
        }

        //Нахождение индексов максимального и минимального элементов
        int indexOfMin = arr.indexOf(minNum);
        int indexOfMax = arr.indexOf(maxNum);

        //Проход ->
        if (indexOfMin < indexOfMax) {
            for (int i = indexOfMin; i != indexOfMax; i++) {
                sum += arr.get(i);
            }
        }

        //Проход <-
        if (indexOfMin > indexOfMax) {
            for (int i = indexOfMax; i != indexOfMin; i++) {
                sum += arr.get(i);
            }
        }

        System.out.println(sum);
    }

    private static void task3() {
        int num;
        int divideCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Not a number! Try again: ");
            scanner.next();
        }
        num = scanner.nextInt();

        while (num < 0) {
            System.out.println("Input error!");
            while (!scanner.hasNextInt()) {
                System.out.println("Not a number! Try again: ");
                scanner.next();
            }
            num = scanner.nextInt();
        }
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) divideCount++;
        }
        if (divideCount == 2) {
            System.out.println("Primitive number!");
        } else {
            System.out.println("Not primitive number!");
        }
    }

    private static void task4(int num, int delta) {
        Random random = new Random();
        Integer[][] arr = new Integer[5][5];

        //Заполнение массива
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(50);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == num) {
                    System.out.println("Coordinates of " + num + ": [" + i + "][" + j + "]");
                    break;
                }
            }
        }


        int stepsCounter = 0;

        loop1:
        for (int i = 1; i < arr.length; i++) {
            stepsCounter++;
            for (int j = 1; j < arr.length; j++) {
                stepsCounter++;
                if (arr[i][j] == num) {
                    System.out.println("Coordinates of " + num + ": [" + i + "][" + j + "]");
                    System.out.println("Counter: " + stepsCounter);
                }
                if (j == arr.length - 1) {
                    break loop1;
                }
            }
        }

        stepsCounter = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] < (num - delta) || arr[i][j] > (num + delta)) {
                    continue;
                }
                stepsCounter++;
            }
        }

        System.out.println("Counter = " + stepsCounter);
    }

    private static void task5(int arraySize) {
        int[] arr = Utils.createRandomArr(arraySize, 10, 99);

        System.out.println(Arrays.toString(arr));

        boolean isIncreasing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isIncreasing = false;
                break;
            }
        }

        System.out.println("Increasing array: " + isIncreasing);
    }

    private static void task6(int sizeX, int sizeY) {
        Character[][] arr = new Character[sizeX][sizeY];


        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i))) {
                    arr[i][j] = ' ';
                } else {
                    arr[i][j] = '*';
                }
            }
        }

        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i)) {
                    arr[i][j] = ' ';
                } else {
                    arr[i][j] = '*';
                }
            }
        }

        for (Character[] arr2 : arr) {
            for (Character val : arr2) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

    private static void task7(int arraySize) {
        int[] arr = Utils.createRandomArr(arraySize, 10, 99);

        System.out.println(Arrays.toString(arr));

        int elementIndex = 0;

        while (arr[elementIndex] <= arr[elementIndex + 1]) {
            elementIndex++;
            if (elementIndex == arr.length - 1) {
                System.out.println("Array is increasing: true");
                return;
            }
        }
        System.out.println("Array is increasing: false");
    }

    private static void task8(int arraySize) {
        int[] arr = Utils.createRandomArr(arraySize, 10, 99);
        System.out.println(Arrays.toString(arr));

        int elementIndex = 0;

        do {
            if (elementIndex == arr.length - 1) {
                System.out.println("Array is increasing: true");
                return;
            }
            if (arr[elementIndex] <= arr[elementIndex + 1]) {
                elementIndex++;
            } else {
                System.out.println("Array is increasing: false");
                return;
            }
        } while (elementIndex != arr.length);
    }

    private static void task9() {
        List<String> deck = Utils.createDeck();

        System.out.println(deck.get(((int) (Math.random() * 52))));


    }

    private static void task10() {
        List<String> deck = Utils.createDeck();

        Collections.shuffle(deck);

        deck.forEach(System.out::println);
    }
}
