package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Integer number = -1;
        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = 0;
        int sumOfNumbers = 0;
        double average;
        List<Integer> numArray = new ArrayList<>();

        while (true) {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
            if (number == 0) break;
            numArray.add(number);
        }
        System.out.println("Вышел из цыкла");
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