package DoubleDispatch;

public interface RoomVisitor {
    void visit(SingleRoom visit);

    void visit(DoubleRoom visit);

    void visit(DeluxeRoom visit);

}
