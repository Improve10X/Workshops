package com.improve10x.workshops.handson.unittest.inventory.cleancode;

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
