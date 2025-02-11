package PracticeSet_1.IPL;

public class Team implements ITeams{

    String name;
    Mediator mediator;

    public Team(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.add(this);
    }

    @Override
    public void raise(int x) {
        System.out.println(name+"  Calls");
        mediator.receivedBid(this,x);
    }

    @Override
    public void receiveNotification(int a) {
        System.out.println("Raised the Bit!! new Bid: "+a);
    }
}
