package DoubleDispatch;

public class DeluxeRoom implements  Rooms{
    public int price;
    @Override
    public void acceptInvitation(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
