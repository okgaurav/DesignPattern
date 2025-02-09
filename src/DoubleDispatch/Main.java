package DoubleDispatch;

public class Main {
    public static void main(String[] args) {
        Rooms rooms=new SingleRoom();
        RoomVisitor visitor=new RoomPricingVisitor();
        rooms.acceptInvitation(visitor);
        System.out.println(((SingleRoom)rooms).price);
    }
}
