package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        int choice = 2;
        MotorVehicleFactory v;
        switch (choice){
            case  2:
                v = new BikeFactory();
                v.create();
                break;
            case  4:
                v = new CarFactory();
                v.create();
                break;
        }
    }
}
