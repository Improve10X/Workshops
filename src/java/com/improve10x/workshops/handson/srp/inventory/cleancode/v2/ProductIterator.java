package com.improve10x.workshops.handson.srp.inventory.cleancode.v2;

import java.util.List;

// Concrete iterator for the product collection
class ProductIterator implements Iterator {
    private List<Product> products;
    private int current;

    public ProductIterator(List<Product> products) {
        this.products = products;
        this.current = 0;
    }

    public Product first() {
        if (products.isEmpty()) {
            return null;
        }
        current = 0;
        return products.get(current);
    }

    public Product next() {
        if (hasNext()) {
            return products.get(++current);
        }
        return null;
    }

    public boolean hasNext() {
        return current < products.size() - 1;
    }
}
