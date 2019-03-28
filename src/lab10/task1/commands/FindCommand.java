package lab10.task1.commands;

import lab10.task1.FileManager;

import java.io.File;

public class FindCommand implements AbstractCommand {
    @Override
    public void executeCommand(String fileName) {
        File file = new File(FileManager.getFile().getAbsolutePath() + "\\" + fileName);
        if (file.exists()) {
            System.out.println("File was founded: " + file.getName());
        } else {
            System.out.println("File was not founded: ");
        }

    }
}
