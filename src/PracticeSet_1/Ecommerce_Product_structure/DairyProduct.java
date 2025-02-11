package PracticeSet_1.Ecommerce_Product_structure;

import java.util.ArrayList;
import java.util.List;

public class DairyProduct implements Products{
    List<Products> dairyProducts;

    public DairyProduct() {
        this.dairyProducts = new ArrayList<>();
    }

    public void add(Products products){
        dairyProducts.add(products);
    }
    @Override
    public void ls() {
        System.out.println("All Products are Listed Below");
        int i=1;
        for (Products products: dairyProducts)
            products.ls();
    }
}
