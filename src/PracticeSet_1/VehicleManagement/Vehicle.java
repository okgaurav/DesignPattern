package PracticeSet_1.VehicleManagement;

public abstract class Vehicle {
    Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }
    abstract public void setupEngine();
}
