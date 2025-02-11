package PracticeSet_1.CoffeeShopManagement;

public class Sweeteners extends Ingredients {
    Coffee coffee;

    public Sweeteners(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return 0.99 + coffee.cost();
    }
}
