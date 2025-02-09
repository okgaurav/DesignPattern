package DoubleDispatch;

public class DoubleRoom implements  Rooms{

    public int price;
    @Override
    public void acceptInvitation(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
