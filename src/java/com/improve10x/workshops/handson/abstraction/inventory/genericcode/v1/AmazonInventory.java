package com.improve10x.workshops.handson.abstraction.inventory.genericcode.v1;

import java.util.ArrayList;
import java.util.List;

public class AmazonInventory {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 99999.99);
        Product product2 = new Product("Smartphone", 49999.99);
        Product product3 = new Product("Headphones", 7999.99);

        // Create an inventory and add products
        List<Product> inventory = new ArrayList<>();
        inventory.add(product1);
        inventory.add(product2);
        inventory.add(product3);

        for(Product product : inventory) {
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }
}