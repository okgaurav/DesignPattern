package PracticeSet_1.VehicleManagement;

public class SUV extends Vehicle{
    public SUV(Engine engine) {
        super(engine);
    }

    @Override
    public void setupEngine() {
        engine.engineCapacity();
    }
}
