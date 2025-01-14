package StrategyDesignPattern.Fixes.strategy;

import StrategyDesignPattern.Fixes.strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
