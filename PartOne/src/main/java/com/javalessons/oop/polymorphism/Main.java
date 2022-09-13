package com.javalessons.oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Belarus", "Travel", EngineType.PETROL, 40, 80, 10);
        bus.fuelUp();

        Auto bus2 = new Bus("Belarus", "Travel", EngineType.PETROL, 40, 80, 10);
        bus2.start();
    }

}
