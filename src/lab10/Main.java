package lab10;

import lab10.task1.FileManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String command = "";

        while (!command.equals("exit")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input command: ");
            command = scanner.nextLine();
            FileManager.execute(command);
        }
    }
}
