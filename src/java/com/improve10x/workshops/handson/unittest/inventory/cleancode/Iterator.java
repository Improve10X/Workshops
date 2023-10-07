package com.improve10x.workshops.handson.unittest.inventory.cleancode;

// Iterator interface
interface Iterator {
    Product first();

    Product next();

    boolean hasNext();
}
