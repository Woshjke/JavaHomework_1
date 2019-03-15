package lab7.task1;

import lab7.task1.interfaces.SwimmingAthlete;

public class SwimmingAthleteImpl
        implements SwimmingAthlete {

    @Override
    public void swim() {
        System.out.println("Swimmer is swimming...");
    }

    @Override
    public void participate() {
        swim();
        System.out.println("----------");
    }
}
