package CaseStudies.AuctionSystemDesign;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new AuctionMediator();
        Colleague colleague1 = new Bidder("Gaurav", auctionMediator);
        Colleague colleague2 = new Bidder("Sonu", auctionMediator);
        Colleague colleague3 = new Bidder("Shivam", auctionMediator);
        colleague1.placeBid(100);
        colleague2.placeBid(200);
        colleague3.placeBid(200);
    }
}
