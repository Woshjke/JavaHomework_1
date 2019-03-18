package lab7.task6.partsOfBuildings;

public class Basement implements IPart {
    private int count;

    public Basement() {
        count = 0;
    }

    @Override
    public void build() {
        count++;
    }

    @Override
    public int getCount() {
        return count;
    }
}
