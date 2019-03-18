package lab7.task6.builders;

import lab7.task6.plans.HousePlan;
import lab7.task6.buildings.House;

public abstract class AbstractHouseBuilder {
    House house;
    HousePlan plan;

    public AbstractHouseBuilder() {
        this.house = new House();
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public HousePlan getPlan() {
        return plan;
    }

    public void setPlan(HousePlan plan) {
        this.plan = plan;
    }


    public abstract AbstractHouseBuilder buildBasement();

    public abstract AbstractHouseBuilder buildWall();

    public abstract AbstractHouseBuilder buildWindow();

    public abstract AbstractHouseBuilder buildDoor();

    public abstract AbstractHouseBuilder buildRoof();
}
