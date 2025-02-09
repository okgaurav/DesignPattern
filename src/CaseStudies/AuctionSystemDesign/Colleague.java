package CaseStudies.AuctionSystemDesign;

public interface Colleague {
    void placeBid(int amount);
    void receiveNotification(int amount);
}
