package lab1.task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        double x1, x2, y1, y2, z1, z2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты первой точки: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Это не число! Попытайтесь снова: ");
            scanner.next();
        }
        x1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введите координаты второй точки: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Это не число! Попытайтесь снова: ");
            scanner.next();
        }
        y1 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введите координаты третьей точки: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Это не число! Попытайтесь снова: ");
            scanner.next();
        }
        z1 = scanner.nextDouble();
        z2 = scanner.nextDouble();
        scanner.nextLine();
        Triangle triangle = new Triangle(x1, x2, y1, y2, z1, z2);
        System.out.println("Периметр данного треугольника: " + triangle.getPerimetr());
        System.out.println("Площадь данного треугольника: " + triangle.getArea());
    }
}
