package lab7.task6.plans;

import lab7.task6.interfaces.IPlan;

public class HousePlan implements IPlan {

    private int basementPlan;
    private int wallsPlan;
    private int windowsPlan;
    private int doorsPlan;
    private int roofPlan;

    public HousePlan() {
        basementPlan = 1;
        wallsPlan = 4;
        windowsPlan = 4;
        doorsPlan = 1;
        roofPlan = 1;
    }

    public int getBasementPlan() {
        return basementPlan;
    }

    public int getWallsPlan() {
        return wallsPlan;
    }

    public int getWindowsPlan() {
        return windowsPlan;
    }

    public int getDoorsPlan() {
        return doorsPlan;
    }

    public int getRoofPlan() {
        return roofPlan;
    }

    public int getCountOfParts() {
        return basementPlan + wallsPlan + windowsPlan + doorsPlan + roofPlan;
    }
}
