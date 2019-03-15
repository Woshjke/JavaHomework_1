package lab7.task1.interfaces;

public interface TeamPlayer extends Athlete {
    void playSport();
    default void showStatistics() {
        System.out.println("Show statistic");
    }
}
