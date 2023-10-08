package com.improve10x.workshops.handson.srp.inventory.cleancode;

import java.util.ArrayList;
import java.util.List;

public class AmazonInventory {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProducts(createProducts());
        displayProducts(inventory.getProducts());
    }

    private static void displayProducts(List<Product> products) {
        System.out.println("***************** List of products ********************\n");
        for(Product product : products) {
            System.out.println(
                    "  Product: " + product.getName()  +
                    ", Price: " + product.getPrice() + "\n");
        }
    }

    private static List<Product> createProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 99999.99));
        products.add(new Product("Smartphone", 49999.99));
        products.add(new Product("Headphones", 7999.99));
        return products;
    }
}