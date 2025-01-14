package StrategyDesignPattern.Fixes;
import StrategyDesignPattern.Fixes.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
