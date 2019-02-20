package Lab1.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int numA, numB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Это не число! Попытайтесь снова: ");
            scanner.next();
        }
        numA = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите второе число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Это не число! Попытайтесь снова: ");
            scanner.next();
        }
        numB = scanner.nextInt();
        scanner.nextLine();

        numsBetwen nums = new numsBetwen(numA, numB);
        nums.output();
    }
}
