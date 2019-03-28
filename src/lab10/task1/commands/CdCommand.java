package lab10.task1.commands;

import lab10.task1.FileManager;

import java.io.File;
import java.util.Arrays;

public class CdCommand implements AbstractCommand {

    public CdCommand() {
    }

    @Override
    public void executeCommand(String str) {
        FileManager.setFile(str);
    }
}
