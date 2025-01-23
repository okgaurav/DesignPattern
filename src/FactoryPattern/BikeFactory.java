package FactoryPattern;

public class BikeFactory extends  MotorVehicleFactory{

    @Override
    public Vehicle createMotorVehicle() {
        return new Bike();
    }
}
