package NULLPattern;

public class Main {
    public static void main(String[] args) {
        var type =  VehicleFactory.getVehicle("Sedan");
        Main main = new Main();
        main.data(type);
    }
    public void data(Vehicle vehicle){
        System.out.println(vehicle.getFuelType());
        System.out.println(vehicle.getEngineCC());
    }
}
