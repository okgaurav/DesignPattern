package StrategyDesignPattern.Fixes;
import StrategyDesignPattern.Fixes.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}