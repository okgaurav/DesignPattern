package FactoryPattern;

public class CarFactory extends MotorVehicleFactory{

    @Override
    public Vehicle createMotorVehicle() {
        return new Car();
    }
}
