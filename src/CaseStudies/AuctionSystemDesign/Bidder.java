package CaseStudies.AuctionSystemDesign;

public class Bidder implements Colleague{
    private String name;
    private Mediator mediator;

    public Bidder(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addColleague(this);
    }

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void placeBid(int amount) {
        System.out.println("Bid Placed By: "+name);
        mediator.placeBid(this,amount);
    }

    @Override
    public void receiveNotification(int amount) {
        System.out.println("Bit notification send to: "+name+", for Amount: "+amount);
    }
}
