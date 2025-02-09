package CaseStudies.AuctionSystemDesign;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator {
    List<Colleague> colleagues = null;
    private Integer maxBid;

    public AuctionMediator() {
        this.colleagues = new ArrayList<>();;
        this.maxBid = 0;
    }

    public Integer getMaxBid() {
        return maxBid;
    }

    public AuctionMediator setMaxBid(Integer maxBid) {
        this.maxBid = maxBid;
        return this;
    }


    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void placeBid(Colleague colleague, int amount) {
        if (amount > maxBid) {
            maxBid = amount;
            for (Colleague colleague1 : colleagues) {
                if (!colleague.equals(colleague1)) {
                    colleague1.receiveNotification(amount);
                }
            }
            System.out.println("--------------------------------------------------------------------");
        }else{
            System.out.println("Bid can not be less then currentBid: "+maxBid);
        }
    }
}
