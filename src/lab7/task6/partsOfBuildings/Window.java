package lab7.task6.partsOfBuildings;

public class Window implements IPart {
    private int count;

    public Window() {
        this.count = 0;
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
