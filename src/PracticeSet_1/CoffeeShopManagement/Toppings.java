package PracticeSet_1.CoffeeShopManagement;

public class Toppings extends Ingredients {
    Coffee coffee;

    public Toppings(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return 1.99 + coffee.cost();
    }
}
