package lab10.task1.commands;

import lab10.task1.FileManager;

import java.io.File;
import java.util.Arrays;

public class LsCommand implements AbstractCommand {

    @Override
    public void executeCommand(String str) {
        File file = new File(str);
        String[] files = file.list();
        System.out.println(Arrays.toString(files));
    }

    public void executeCommand() {
        String[] files = FileManager.getFile().list();
        System.out.println(Arrays.toString(files));
    }
}
