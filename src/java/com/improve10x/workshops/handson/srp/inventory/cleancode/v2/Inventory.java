package com.improve10x.workshops.handson.srp.inventory.cleancode.v2;

import java.util.ArrayList;
import java.util.List;

// Aggregate class that stores products and provides an iterator
class Inventory {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Iterator createIterator() {
        return new ProductIterator(products);
    }
}
