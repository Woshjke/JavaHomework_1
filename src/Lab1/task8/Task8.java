package Lab1.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int sizeX, sizeY;
        char border, inside;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер четырехугольника: ");
        sizeX = scanner.nextInt();
        sizeY = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите символ для контура: ");
        border = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.println("Введите символ для заливки: ");
        inside = scanner.next().charAt(0);
        scanner.nextLine();

        Square square = new Square(sizeX, sizeY, border, inside);
        square.show();
    }
}
