package com.javalessons.oop.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {

        Truck truck = new Truck("Volvo", "L2", EngineType.PETROL, 350, 600, 1000);
        truck.start();
        truck.accelerate(10);
        truck.start();
        truck.fuelUp(200);
        truck.load();
        truck.unLoad();

        System.out.println("\n");
        ElectricCar car = new ElectricCar("Tesla", "S", 100, 4);
        car.start();
        car.stop();
        car.charge();

        System.out.println("\n");
        Bus bus = new Bus("Minsk", "M1", EngineType.PETROL, 10, 100, 30);
        bus.fuelUp(100);
        bus.pickUpPassengers(5);
        bus.start();
        bus.releasePassengers();
    }
}
