package lab7.task6.builders;

import lab7.task6.buildings.House;
import lab7.task6.plans.HousePlan;

public class Director {

    private Team team;
    private HousePlan plan;

    public Director() {
        plan = new HousePlan();
        team = new Team(5, plan);
    }

    public Director(Team team, HousePlan plan) {
        this.team = team;
        this.plan = plan;
    }

    public Director setTeam(Team team) {
        this.team = team;
        this.team.setPlan(plan);
        return this;
    }

    public Director setPlan(HousePlan plan) {
        this.plan = plan;
        return this;
    }

    public Team getTeam() {
        return team;
    }

    public HousePlan getPlan() {
        return plan;
    }

    public House buildHouse() {
        return team.build();
    }

    public void showProgress() {
        double progress = ((double) (team.getHouse().buildParts() / plan.getCountOfParts())) * 100;
        System.out.println("Build progress: " + progress + "%");
    }


}
