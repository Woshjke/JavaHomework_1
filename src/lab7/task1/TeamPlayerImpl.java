package lab7.task1;

import lab7.task1.interfaces.TeamPlayer;

public class TeamPlayerImpl
        implements TeamPlayer {
    @Override
    public void playSport() {
        System.out.println("Team player playing sport");
    }

    @Override
    public void participate() {
        playSport();
        System.out.println("----------");
    }
}
