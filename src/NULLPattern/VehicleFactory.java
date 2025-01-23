package NULLPattern;

public class VehicleFactory {
    static Vehicle getVehicle(String type){
        if (type.equals("Sedan"))
            return new Sedan();
        return new NullVehicle();
    }

}
