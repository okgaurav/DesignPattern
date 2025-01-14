package StrategyDesignPattern.Fixes.strategy;

import StrategyDesignPattern.Fixes.strategy.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("sports drive capability");
    }
}
