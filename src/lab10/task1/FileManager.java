package lab10.task1;

import lab10.task1.commands.*;

import java.io.File;

public class FileManager {

    private static File file;
    private static AbstractCommand rmCommand = new RmCommand();
    private static AbstractCommand lsCommand = new LsCommand();
    private static AbstractCommand cdCommand = new CdCommand();


    public static void setFile(String string) {
        file = new File(string);
    }

    public static File getFile() {
        return file;
    }

    public static void setFile(File file) {
        FileManager.file = file;
    }

    static {
        file = new File(System.getProperty("user.dir"));
        System.out.println(file.getAbsolutePath());
    }

    private FileManager() {

    }

    public static void execute(String command) {
        String[] arrOfString = command.split(" ");

        switch (arrOfString[0]) {
            case "cd": {
                cdCommand.executeCommand(arrOfString[1]);
                break;
            }
            case "ls": {
                new LsCommand();
                break;
            }
            case "find": {
                new FindCommand().executeCommand(arrOfString[1]);
                break;
            }
            case "rm": {
                rmCommand.executeCommand(arrOfString[1]);
                break;
            }
            case "cat": {
                new CatCommand().executeCommand(arrOfString[1]);
                break;
            }
            case "mkdir": {
                new MkDirCommand().executeCommand(arrOfString[1]);
                break;
            }
            case "touch": {
                new TouchCommand().executeCommand(arrOfString);
                break;
            }
            default: {
                break;
            }
        }
    }
}
