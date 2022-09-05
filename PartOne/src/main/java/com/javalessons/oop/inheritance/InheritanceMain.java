package com.javalessons.oop.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
      /*  Auto auto = new Auto();
        System.out.println(auto.getProducer());
        System.out.println(auto.getModel());

        Truck truck = new Truck();
        System.out.println(truck.getProducer());
        System.out.println(truck.getModel());*/

        Bus bus = new Bus("Minsk", "M1", EngineType.PETROL, 10, 100, 30);
        System.out.println(bus.getProducer());
        System.out.println(bus.getModel());
    }
}
