package lab7.task6.interfaces;

public interface IBuilder {
    IPlan getPlan();
    void setPlan(IPlan plan);
    IBuilding getBuilding();
    void setBuilding(IBuilding building);
}
