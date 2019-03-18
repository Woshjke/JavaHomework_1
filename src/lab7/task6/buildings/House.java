package lab7.task6.buildings;

import lab7.task6.partsOfBuildings.*;

public class House {

    private Basement basement;
    private Wall walls;
    private Window windows;
    private Door doors;
    private Roof roof;

    public House() {
        basement = new Basement();
        walls = new Wall();
        windows = new Window();
        doors = new Door();
        roof = new Roof();
    }


    public void addBasement() {
        basement.build();
    }

    public void addWall() {
        walls.build();
    }

    public void addWindow() {
        windows.build();
    }

    public void addDoor() {
        doors.build();
    }

    public void addRoof() {
        roof.build();
    }

    public int getBasement() {
        return basement.getCount();
    }

    public int getWalls() {
        return walls.getCount();
    }

    public int getWindows() {
        return windows.getCount();
    }

    public int getDoors() {
        return doors.getCount();
    }

    public int getRoof() {
        return roof.getCount();
    }

    @Override
    public String toString() {
        return "House {" +
                "basement=" + basement.getCount() +
                ", walls=" + walls.getCount() +
                ", windows=" + windows.getCount() +
                ", doors=" + doors.getCount() +
                ", roof=" + roof.getCount() +
                '}';
    }

    public int buildParts() {
        return basement.getCount() + walls.getCount() + windows.getCount() + doors.getCount() + roof.getCount();
    }

}
