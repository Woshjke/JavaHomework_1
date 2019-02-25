package lab2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        task6();
    }

    public static void task1() {
        int countOfNums = 0;
        int i = 0;
        Integer[] arr = new Integer[100];
        while (countOfNums < 100) {
            if (i % 13 == 0 || i % 17 == 0) {
                arr[countOfNums] = i;
                countOfNums++;
            }
            i++;
        }
        for (Integer a : arr) {
            System.out.println(a);
        }
    }

    public static void task2() {
        List<Integer> arr = new ArrayList<>();
        Random random = new Random();
        int sum = 0;

        //заполнение массива
        for (int i = 0; i < 20; i++) {
            arr.add(random.nextInt(100));
        }

        Integer minNum = 102;
        Integer maxNum = 0;

        //Прохождение по коллекции для значений мксимального и минимального элементов
        for (Integer num : arr) {
            if (num < minNum) minNum = num;
            if (num > maxNum) maxNum = num;
        }

        //Нахождение индексов максимального и минимального элементов
        int indexOfMin = arr.indexOf(minNum);
        int indexOfMax = arr.indexOf(maxNum);


        if (indexOfMin < indexOfMax) {
            for (int i = indexOfMin; i != indexOfMax; i++) {
                sum += arr.get(i);
            }
        }
        if (indexOfMin > indexOfMax) {
            for (int i = indexOfMax; i != indexOfMin; i++) {
                sum += arr.get(i);
            }
        }
        System.out.println(sum);
    }

    public static void task3() {
        int num = 0;
        int devideCount = 0;
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
            if (num % i == 0) devideCount++;
        }
        if (devideCount == 2) {
            System.out.println("Pimitive number!");
        } else {
            System.out.println("Not primitive number!");
        }
    }

    public static void task4(int num, int delta) {
        int counter = 0;
        int counter2 = 0;
        Random random = new Random();
        Integer[][] arr = new Integer[5][5];

        //Вывод массива

        //Заполнение массива
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(50);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == num) {
                    System.out.println("Coordinates of " + num + ": [" + i + "][" + j + "]");
                    break;
                }
            }
        }

        loop1:
        for (int i = 1; i < 5; i++) {
            counter++;
            loop2:
            for (int j = 1; j < 5; j++) {
                counter++;
                if (arr[i][j] == num) {
                    System.out.println("Coordinates of " + num + ": [" + i + "][" + j + "]");
                    System.out.println("Counter: " + counter);
                }
                if (j == 5)
                    break loop1;     //Statement 1
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] < (num - delta) || arr[i][j] > (num + delta)) {
                    continue;
                }
                counter2++;
            }
        }

        System.out.println("Counter2 = " + counter2);


    }

    public static void task5() {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (10 + Math.random() * 89));
        }
        for (int i = 0; i < arr.length; i++) {

        }
    }

    public static void task6() {
        int arr[][] = new int[5][5];


        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i))) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i)) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }

        //Вывод на экран
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    public static void task7() {

    }

    public static void task8() {

    }

    public static void task9() {
        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        List<String> deck = new ArrayList<>();

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                deck.add(cards[j] + " of " + suits[i]);
            }
        }

        System.out.println(deck.get(((int) (Math.random() * 52))));

    }

    public static void task10() {
        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        List<String> deck = new ArrayList<>();

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                deck.add(cards[j] + " of " + suits[i]);
            }

            Collections.shuffle(deck);

            for (String card : deck) {
                System.out.println(card);
            }
        }
    }
}
