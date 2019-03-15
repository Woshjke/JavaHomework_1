package lab7.task5;

public interface LogingSupport {
    default void log(String message, Object obj) {
        System.out.println(message + ":" + obj.toString());
    }

    void log();
}
