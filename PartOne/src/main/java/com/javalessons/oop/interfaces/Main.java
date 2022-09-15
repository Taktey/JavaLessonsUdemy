package com.javalessons.oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Deliverable pizza = new Pizza("Neapol", 1, 20, Size.L);
        Deliverable phone = new CellPhone("Nokia", "X1", 1, 250);
        printDeliveryPrice(phone);
        printDeliveryPrice(pizza);

    }

    private static void printDeliveryPrice(Deliverable dell) {
        System.out.println("Delivery price " + dell.calcDeliveryPrice());
    }
}
