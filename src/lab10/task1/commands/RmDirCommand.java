package lab10.task1.commands;

import lab10.task1.FileManager;

import java.io.File;

public class RmDirCommand implements AbstractCommand {
    @Override
    public void executeCommand(String dirName) {

    }

    public void executeCommand(String dirName, String newName) {
        File rmFile = new File(FileManager.getFile().getAbsolutePath() + "\\" + dirName);
        File newFile = new File(FileManager.getFile().getAbsolutePath() + "\\" + newName);
        if (rmFile.renameTo(newFile)) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }
    }
}
