package DecoratorPattern.Toppings;

import DecoratorPattern.BasePizza;

public class ExtraCheese extends ToppingsDecorator{
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost(){
        return this.basePizza.cost()+20;
    }
}
