package lab7.task1.interfaces;

public interface SwimmingAthlete extends Athlete {
    void swim();
    static void availableDistances() {
        System.out.println("Show available distance");
    }
}
