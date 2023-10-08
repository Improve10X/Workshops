package com.improve10x.workshops.handson.srp.inventory.cleancode.v1;

import java.util.ArrayList;
import java.util.List;

class Inventory {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public List<Product> getProducts() {
        return products;
    }
}
