package DecoratorPattern;

import DecoratorPattern.Toppings.ExtraCheese;
import DecoratorPattern.Toppings.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Margerita();
        System.out.println(basePizza.cost());
        System.out.println("Adding Topping Like -> Mushroom");
        basePizza = new Mushroom(basePizza);
        System.out.println(basePizza.cost());
        System.out.println("Adding Topping Like -> Cheese");
        basePizza = new ExtraCheese(basePizza);
        System.out.println(basePizza.cost());
        System.out.println("Adding Topping Like -> Cheese");
        basePizza = new ExtraCheese(basePizza);
        System.out.println(basePizza.cost());
    }
}
