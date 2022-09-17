package com.javalessons.oop.interfaces;

public interface Deliverable {
    static final int QUANTITY = 5; // all fields should be constant

    int calcDeliveryPrice();
    /* public abstract void calcDeliveryPrice(); All methods in interfaces
    are public and abstract by default */
}
