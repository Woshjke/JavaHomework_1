package lab10.task1.commands;

import lab10.task1.FileManager;

import java.io.File;

public class RmCommand implements AbstractCommand {

    public RmCommand() {
    }

    @Override
    public void executeCommand(String filename) {
        File rmFile = new File(FileManager.getFile().getAbsolutePath() + "\\" + filename);
        if (rmFile.delete()) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }
    }
}
