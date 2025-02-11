package PracticeSet_1.CoffeeShopManagement;

public class Milk extends Ingredients {
    Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return 2.99 + coffee.cost();
    }
}
