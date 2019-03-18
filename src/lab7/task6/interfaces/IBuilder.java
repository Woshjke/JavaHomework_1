package lab7.task6.interfaces;

import lab7.task6.plans.HousePlan;

public interface IBuilder {
    IPlan getPlan();
    void setPlan(IPlan plan);
    IBuilding getBuilding();
    void setBuilding(IBuilding building);
}
