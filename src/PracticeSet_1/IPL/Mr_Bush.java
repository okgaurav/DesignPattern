package PracticeSet_1.IPL;

import java.util.ArrayList;
import java.util.List;

public class Mr_Bush implements Mediator{
    List<ITeams> teams;
    int currentBid;

    public Mr_Bush() {


        this.teams = new ArrayList<>();
        currentBid=0;
    }

    @Override
    public void receivedBid(ITeams teams, int amount) {
        currentBid=amount;
        for (ITeams iTeams:this.teams){
            if(!iTeams.equals(teams)){
                iTeams.receiveNotification(amount);
            }
        }
    }

    @Override
    public void add(ITeams teams) {
        this.teams.add(teams);
    }
}
