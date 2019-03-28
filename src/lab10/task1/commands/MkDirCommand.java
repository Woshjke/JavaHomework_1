package lab10.task1.commands;

import lab10.task1.FileManager;

import java.io.File;

public class MkDirCommand implements AbstractCommand {
    @Override
    public void executeCommand(String dirName) {
        File folder = new File(FileManager.getFile().getAbsolutePath() + "\\" + dirName);
        if (folder.mkdir()) {
            System.out.println("Dir was created");
        } else {
            System.out.println("Dit was not created");
        }
    }
}
