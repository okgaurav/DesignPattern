package PracticeSet_1.IPL;

public class Runner {
    public static void main(String[] args) {
        //mediator Design Pattern

        Mediator mediator= new Mr_Bush();
        ITeams csk=new Team("CSK",mediator);
        ITeams mi=new Team("MI",mediator);
        csk.raise(10);
        mi.raise(15);
    }
}
