package Lab1.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int value, percent;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальный вклад: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Это не число! Попытайтесь снова: ");
            scanner.next();
        }
        value = scanner.nextInt();

        System.out.println("Введите процентную ставку: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Это не число! Попытайтесь снова: ");
            scanner.next();
        }
        percent = scanner.nextInt();


        BankAccount account = new BankAccount(value, percent);
        account.doubleValue();
    }
}
