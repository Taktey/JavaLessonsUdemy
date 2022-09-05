package com.javalessons.oop.inheritance;

public class Truck extends PetrolAuto {
    public Truck(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int cargoWeight) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.cargoWeight = cargoWeight;
        System.out.println("Constructing truck");
    }

    public void load() {
        System.out.println("Cargo loaded");
    }

    public void unLoad() {
        System.out.println("Cargo unloaded");
    }

    private int cargoWeight;



    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
