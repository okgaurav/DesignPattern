package PracticeSet_1.VehicleManagement;

public class Runner {
    public static void main(String[] args) {
        Engine engine = new DieselEngine();
        Vehicle vehicle = new SUV(engine);
        vehicle.setupEngine();
    }
}
