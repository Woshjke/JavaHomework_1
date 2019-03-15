package lab7.task1;

import lab7.task1.interfaces.JumpingAthlete;

public class JumpingAthleteImpl
        implements JumpingAthlete {
    @Override
    public void highJump() {
        System.out.println("Jumper is making high jump");
    }

    @Override
    public void longJump() {
        System.out.println("Jumper is making long jump");
    }

    @Override
    public void tripleJump() {
        System.out.println("Jumper is making triple jump");
    }

    @Override
    public void participate() {
        highJump();
        longJump();
        tripleJump();
        System.out.println("----------");
    }
}
