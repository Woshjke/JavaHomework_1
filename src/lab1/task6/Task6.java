package lab1.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String ticketNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ticket number: ");
        ticketNumber = scanner.next();
        while (ticketNumber.length() != 6 || !ticketNumber.matches("\\d*")) {
            System.out.println("Вы ввели неверный номер билета! Попытайтесь снова: ");
            ticketNumber = scanner.next();
        }
        if (LuckyTicket.isLuckyTicket(ticketNumber)) {System.out.println("This is lucky ticket!");}
        else {System.out.println("This is ragular ticket!");}
    }

}
