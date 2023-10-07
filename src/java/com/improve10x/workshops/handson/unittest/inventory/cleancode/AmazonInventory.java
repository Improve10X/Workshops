package com.improve10x.workshops.handson.unittest.inventory.cleancode;

import java.util.ArrayList;
import java.util.List;

public class AmazonInventory {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 99999.99);
        Product product2 = new Product("Smartphone", 49999.99);
        Product product3 = new Product("Headphones", 7999.99);

        // Create an inventory and add products
        Inventory inventory = new Inventory();
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Create an iterator and iterate over the products
        Iterator iterator = inventory.createIterator();
        Product currentProduct = iterator.first();

        while (currentProduct != null) {
            System.out.println("Product: " + currentProduct.getName() + ", Price: $" + currentProduct.getPrice());
            currentProduct = iterator.next();
        }
    }
}