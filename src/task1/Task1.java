package task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double temperatureInCelsius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуту в градусах Фаренгейта");
        while (!scanner.hasNextDouble()) {
            System.out.println("Неверный ввод! Попытайтесь снова: ");
            scanner.next();
        }
        temperatureInCelsius = scanner.nextDouble();
        Temperature.convertFahrenheitToCelsius(32.2);
    }
}
