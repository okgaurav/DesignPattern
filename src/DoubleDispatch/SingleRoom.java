package DoubleDispatch;

public class SingleRoom implements  Rooms{

    public int price;
    @Override
    public void acceptInvitation(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
