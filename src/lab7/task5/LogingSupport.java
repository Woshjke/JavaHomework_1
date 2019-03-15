package lab7.task5;

public interface LogingSupport {

    default void log(String message, Object obj) {
        System.out.println("Message: " + message + "\nObject information: " + obj.toString());
    }

    void log();
}
