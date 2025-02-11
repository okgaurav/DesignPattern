package FlyweightDesignPattern;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        IRobot hum = RobotFactory.createRobot("DOG");
        IRobot hum2 = RobotFactory.createRobot("DOG");
        hum.display(1,2);
        hum.display(5,5);
        System.out.println(hum.equals(hum2));
    }
}
