package PracticeSet_1.VehicleManagement;

public class DieselEngine implements Engine {
    @Override
    public void engineCapacity() {
        System.out.println("Diesel Engine Specifications");
        System.out.println("Power: 140ps");
        System.out.println("Torque: 300Nm");
        System.out.println("Capacity: 2200cc");
    }
}
