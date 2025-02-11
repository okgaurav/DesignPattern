package PracticeSet_1.Ecommerce_Product_structure;

public class Runner {
    public static void main(String[] args) {
        DairyProduct products= new DairyProduct();
        Products butter = new Product("Butter");
        Products milk = new Product("Milk");
        products.add(milk);
        products.add(butter);
        DairyProduct randomProducts = new DairyProduct();
        Products maggi = new Product("Maggi");
        Products ghadi = new Product("Ghadi");
        randomProducts.add(maggi);
        randomProducts.add(ghadi);
        products.add(randomProducts);

        products.ls();
    }
}
