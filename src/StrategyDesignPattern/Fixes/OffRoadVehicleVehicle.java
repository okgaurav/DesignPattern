package StrategyDesignPattern.Fixes;

import StrategyDesignPattern.Fixes.strategy.SportsDriveStrategy;

public class OffRoadVehicleVehicle extends Vehicle {
    public OffRoadVehicleVehicle() {
        super(new SportsDriveStrategy());
    }
}
