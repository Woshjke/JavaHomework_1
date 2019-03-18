package lab7.task6.partsOfBuildings;

import lab7.task6.interfaces.IPart;

public class Roof implements IPart {

    private int count;

    public Roof() {
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
