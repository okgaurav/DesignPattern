package CaseStudies.AuctionSystemDesign;

import java.util.List;

public interface Mediator {
    void addColleague(Colleague colleague);
    void placeBid(Colleague colleague, int amount);
}
