package lab10;

import lab10.task1.FileManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String command = "";

        while (!command.equals("exit")) {
            System.out.println("Input command: ");
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            FileManager.execute(command);
        }
    }
}
