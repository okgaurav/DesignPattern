package PracticeSet_1.VehicleManagement;

public class PetrolEngine implements Engine {
    @Override
    public void engineCapacity() {
        System.out.println("Petrol Engine Specifications");
        System.out.println("Power: 110ps");
        System.out.println("Torque: 150Nm");
        System.out.println("Capacity: 1700cc");
    }
}
