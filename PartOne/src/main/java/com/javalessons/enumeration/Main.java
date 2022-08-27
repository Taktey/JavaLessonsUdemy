package com.javalessons.enumeration;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setSize(Size.BIG);
        dog.bark();

        Dog dog2 = new Dog();
        dog2.setSize(Size.AVERAGE);
        dog2.bark();

        Dog dog3 = new Dog();
        dog3.setSize(Size.SMALL);
        dog3.bark();
    }
}
