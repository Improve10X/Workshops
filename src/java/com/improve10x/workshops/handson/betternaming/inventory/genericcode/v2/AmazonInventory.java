package com.improve10x.workshops.handson.betternaming.inventory.genericcode.v2;

import java.util.ArrayList;
import java.util.List;

public class AmazonInventory {
    public static void main(String[] args) {
        // Create some products
        String product1 = new String("Laptop");
        String product2 = new String("Smartphone");
        String product3 = new String("Headphones");
        // Create an inventory and add products
        List<String> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        double price1 = 9999.0;
        double price2 = 10999.0;
        double price3 = 14999.0;
        List<Double> prices = new ArrayList<>();
        prices.add(price1);
        prices.add(price2);
        prices.add(price3);
        for(int i = 0; i < products.size(); i++) {
            System.out.println("Product: " + products.get(i) + ", Price: $" + prices.get(i));
        }
    }
}