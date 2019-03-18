package lab7.task6.builders;

import lab7.task6.interfaces.IBuilder;
import lab7.task6.interfaces.IBuilding;
import lab7.task6.plans.HousePlan;
import lab7.task6.buildings.House;

public abstract class AbstractHouseBuilder implements IBuilder {

    House house;
    HousePlan plan;

    public AbstractHouseBuilder() {
        this.house = new House();
    }

    public House getBuilding() {
        return house;
    }

    public void setBuilding(House house) {
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
