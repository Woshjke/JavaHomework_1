package lab7.task1;

import lab7.task1.interfaces.JumpingAthlete;
import lab7.task1.interfaces.SwimmingAthlete;
import lab7.task1.interfaces.TeamPlayer;

public class AllOverParticipantImpl
        implements SwimmingAthlete, JumpingAthlete, TeamPlayer {

    @Override
    public void highJump() {
        System.out.println("Athlete making high jump");
    }

    @Override
    public void longJump() {
        System.out.println("Athlete making long jump");
    }

    @Override
    public void tripleJump() {
        System.out.println("Athlete making triple jump");
    }

    @Override
    public void swim() {
        System.out.println("Athlete swimming");
    }

    @Override
    public void playSport() {
        System.out.println("Athlete playing sport");
    }

    @Override
    public void participate() {
        highJump();
        longJump();
        tripleJump();
        swim();
        System.out.println("----------");
    }
}
