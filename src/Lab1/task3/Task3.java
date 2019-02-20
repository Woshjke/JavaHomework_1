package Lab1.task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Введите число в диапазоне от 100 до 999: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Это не число! Попытайтесь снова: ");
            scanner.next();
        }
        number = scanner.nextInt();
        String answere = Numbers.numberToString(number);
        System.out.println(answere);
    }
}
