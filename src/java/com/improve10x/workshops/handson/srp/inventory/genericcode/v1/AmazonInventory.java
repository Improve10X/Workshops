package com.improve10x.workshops.handson.srp.inventory.genericcode.v1;

import java.util.ArrayList;
import java.util.List;

public class AmazonInventory {
    public static void main(String[] args) {
        List<Product> inventory = getProducts();
        displayProducts(inventory);
    }

    private static List<Product> getProducts() {
        List<Product> inventory = new ArrayList<>();
        inventory.add(createProduct("Laptop", 99999.99));
        inventory.add(createProduct("Smartphone", 49999.99));
        inventory.add(createProduct("Headphones", 7999.99));
        return inventory;
    }

    private static void displayProducts(List<Product> inventory) {
        for(Product product : inventory) {
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }

    private static Product createProduct(String name, double price) {
        return new Product(name, price);
    }
}