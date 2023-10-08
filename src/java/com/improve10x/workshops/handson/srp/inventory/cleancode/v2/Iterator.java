package com.improve10x.workshops.handson.srp.inventory.cleancode.v2;

// Iterator interface
interface Iterator {
    Product first();

    Product next();

    boolean hasNext();
}
