package StrategyDesignPattern.Fixes;


import StrategyDesignPattern.Fixes.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}