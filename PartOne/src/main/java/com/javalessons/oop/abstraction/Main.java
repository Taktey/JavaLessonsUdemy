package com.javalessons.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Belarus", "Travel", EngineType.PETROL, 40, 80, 10);
        bus.fuelUp();

        Auto bus2 = new Bus("Belarus", "Travel", EngineType.PETROL, 40, 80, 10);
        bus2.start();

        Auto electricCar = new ElectricCar("Tesla", "S", 1000, 4);

        runCar(bus);
        runCar(bus2);
        runCar(electricCar);
    }

    private static void runCar(Auto auto) {
        auto.start();
        auto.stop();
        auto.energize();
    }
}


