package lab7.task6.builders;

import lab7.task6.builders.AbstractHouseBuilder;
import lab7.task6.builders.HouseBuilder;
import lab7.task6.buildings.House;
import lab7.task6.plans.HousePlan;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<AbstractHouseBuilder> team;
    private HousePlan plan;
    private House house;

    public Team(int numOfWorkers, HousePlan plan) {
        team = new ArrayList<>();
        house = new House();
        this.plan = plan;
        for (int i = 0; i < numOfWorkers; i++) {
            addBuilder(new HouseBuilder(this.plan, this.house));
        }
    }

    public List<AbstractHouseBuilder> getTeam() {
        return team;
    }

    public void setTeam(List<AbstractHouseBuilder> team) {
        this.team = team;
    }

    public HousePlan getPlan() {
        return plan;
    }

    public void setPlan(HousePlan plan) {
        this.plan = plan;
    }

    public House getHouse() {
        return house;
    }


    public void addBuilder(AbstractHouseBuilder builder) {
        builder.setPlan(plan);
        team.add(builder);
    }

    public void removeBuilder(int index) {
        team.remove(index);
    }

    public boolean isBuild() {
        return house.buildParts() == plan.getCountOfParts();
    }

    public House build() {
        while (!isBuild()) {
            for (AbstractHouseBuilder iter : team) {
                if (house.getBasement() < plan.getBasementPlan()) {
                    iter.buildBasement();
                    continue;
                }
                if (house.getWalls() < plan.getWallsPlan()) {
                    iter.buildWall();
                    continue;
                }
                if (house.getWindows() < plan.getWindowsPlan()) {
                    iter.buildWindow();
                    continue;
                }
                if (house.getDoors() < plan.getDoorsPlan()) {
                    iter.buildDoor();
                    continue;
                }
                if (house.getRoof() < plan.getRoofPlan()) {
                    iter.buildRoof();
                }
            }
        }
        return getHouse();
    }

    public void alreadyBuild() {
        System.out.println("Already build: " +
                "\nBasement: " + getHouse().getBasement() +
                "\nWalls: " + getHouse().getWalls() +
                "\nWindows: " + getHouse().getWindows() +
                "\nDoors: " + getHouse().getDoors() +
                "\nRoof: " + getHouse().getRoof());
    }


}
