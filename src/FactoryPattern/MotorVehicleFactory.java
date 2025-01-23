package FactoryPattern;

public abstract class MotorVehicleFactory {
    public abstract Vehicle createMotorVehicle();

    public Vehicle create() {
        Vehicle motorVehicle = createMotorVehicle();
        motorVehicle.description();
        return motorVehicle;
    }

}
