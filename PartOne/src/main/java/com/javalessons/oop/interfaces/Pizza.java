package com.javalessons.oop.interfaces;

public class Pizza implements Priceable {
    private String name;
    private int quantity;
    private int price;
    private Size size;

    public Pizza(String name, int quantity, int price, Size size) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.size = size;
    }

    @Override
    public int calcDeliveryPrice() {
        if (size == Size.XL || quantity > 1) {
            return 0;
        } else return 7;
    }

    @Override
    public int calcOrderPrice() {
        Priceable.doSmth();
        return quantity * price;
    }
}
