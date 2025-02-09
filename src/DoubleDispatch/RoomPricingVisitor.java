package DoubleDispatch;

public class RoomPricingVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom visit) {
        System.out.println("Single Room Visit initiated");
        visit.price = 1000;
    }

    @Override
    public void visit(DoubleRoom visit) {
        System.out.println("DoubleRoom Visit initiated");
        visit.price = 2000;

    }

    @Override
    public void visit(DeluxeRoom visit) {
        System.out.println("DeluxeRoom Visit initiated");
        visit.price = 5000;
    }
}
