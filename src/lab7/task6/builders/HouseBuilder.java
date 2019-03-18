package lab7.task6.builders;

import lab7.task6.plans.HousePlan;
import lab7.task6.buildings.House;

public class HouseBuilder extends AbstractHouseBuilder {

    public HouseBuilder(HousePlan plan, House house) {
        this.plan = plan;
        this.house = house;
    }


    public AbstractHouseBuilder buildBasement() {
        if (house.getBasement() < plan.getBasementPlan()) {
            System.out.println("Building basement...");
            house.addBasement();
        } else {
            System.out.println("Basement is already build");
        }
        return this;
    }

    public AbstractHouseBuilder buildWall() {
        if (house.getWalls() < plan.getWallsPlan()) {
            System.out.println("Building wall...");
            house.addWall();
        } else {
            System.out.println("All walls was build!");
        }
        return this;
    }

    public AbstractHouseBuilder buildWindow() {
        if (house.getWindows() < plan.getWindowsPlan()) {
            System.out.println("Building Window...");
            house.addWindow();
        } else {
            System.out.println("All windows was build");
        }
        return this;
    }

    public AbstractHouseBuilder buildDoor() {
        if (house.getDoors() < plan.getDoorsPlan()) {
            System.out.println("Building door...");
            house.addDoor();
        } else {
            System.out.println("All doors was build");
        }
        return this;
    }

    public AbstractHouseBuilder buildRoof() {
        if (house.getRoof() < plan.getRoofPlan()) {
            System.out.println("Building roof...");
            house.addRoof();
        } else {
            System.out.println("All roofs was build");
        }
        return this;
    }
}
