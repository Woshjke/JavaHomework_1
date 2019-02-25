package lab1.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumsArray {
    /**
     * Тут должно быть описание метода
     */
    public static void start() {
        Integer number = -1;
        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = 0;
        int sumOfNumbers = 0;
        double average;
        List<Integer> numArray = new ArrayList<>();

        while (number != 0) {
            System.out.println("Введите число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число! Попытайтесь снова: ");
                scanner.next();
            }
            number = scanner.nextInt();
            if (number == 0) break;
            numArray.add(number);
        }
        System.out.println("Вышел из цикла");
        for (Integer i : numArray) {
            countOfNumbers++;
            sumOfNumbers += i;
        }
        average = ((double) sumOfNumbers / countOfNumbers);
        System.out.println("Количество введенных чисел: " + countOfNumbers);
        System.out.println("Сумма введеных чисел: " + sumOfNumbers);
        System.out.println("Среднее арифметическое введеных чисел " + average);
    }
}
