package lab10.task1.commands;

public class ExitCommand implements AbstractCommand {

    public ExitCommand(String str) {
        executeCommand(str);
    }

    @Override
    public void executeCommand(String str) {
        System.exit(0);
    }
}
