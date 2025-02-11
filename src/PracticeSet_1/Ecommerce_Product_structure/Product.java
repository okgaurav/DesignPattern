package PracticeSet_1.Ecommerce_Product_structure;

public class Product implements  Products{
    String name;
    public Product(String name) {
        this.name = name;
    }
    @Override
    public void ls() {
        System.out.println(name);
    }
}
