package PracticeSet_1.CoffeeShopManagement;

public class Runner {
    public static void main(String[] args) {
        Coffee coffee = new Latte();
        System.out.println("Cost of Simple Latte  $ "+coffee.cost());
        coffee = new Milk(coffee);
        System.out.println("Cost of Latte +Milk  $ "+coffee.cost());
        coffee = new Sweeteners(coffee);
        System.out.println("Cost of Latte +Milk+ Sweeteners  $ "+coffee.cost());
    }
}
