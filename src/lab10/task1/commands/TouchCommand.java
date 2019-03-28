package lab10.task1.commands;

import lab10.task1.FileManager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TouchCommand implements AbstractCommand {
    @Override
    public void executeCommand(String str) {

    }

    public void executeCommand(String[] arr) {
        File file = new File(FileManager.getFile().getAbsolutePath() + "\\" + arr[1]);
        try {
            if (file.createNewFile()) {
                System.out.println("File was created");
            } else {
                System.out.println("File was not created");
            }
            OutputStream outputStream = new FileOutputStream(file);
            for (int i = 2; i < arr.length; i++) {
                outputStream.write(arr[i].getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
