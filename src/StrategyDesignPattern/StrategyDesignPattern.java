package StrategyDesignPattern;

import StrategyDesignPattern.Fixes.PassengerVehicle;
import StrategyDesignPattern.Fixes.Vehicle;

public class StrategyDesignPattern {
    public static void main(String[] args) {
        Vehicle vehicle = new PassengerVehicle();
        vehicle.drive();
    }
}
