package FlyweightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static Map<String, IRobot> robotCache = new HashMap<>();

    public static IRobot createRobot(String robot){
        if(robotCache.containsKey(robot)){
            return  robotCache.get(robot);
        }else {
            if(robot == "DOG"){
                IRobot humanoid = new Dog("Puppy","small");
                robotCache.put(robot,humanoid);
                return humanoid;
            }else{
                IRobot humanoid = new Man("Puppy","small");
                robotCache.put(robot,humanoid);
                return humanoid;
            }
        }
    }
}
