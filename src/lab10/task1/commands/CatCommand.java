package lab10.task1.commands;

import lab10.task1.FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CatCommand implements AbstractCommand {
    @Override
    public void executeCommand(String filename) {
        File file = new File(FileManager.getFile().getAbsolutePath() + "\\" + filename);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            //todo Переделать под BufferedReader
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
