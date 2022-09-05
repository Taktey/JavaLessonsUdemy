package com.javalessons.oop.inheritance;

public class PetrolAuto extends Auto {

    private int availablePetrol;
    private int tankVolume;

    public void fuelUp(int petrolVolume) {
        availablePetrol += petrolVolume;
        System.out.println("Adding petrol");
    }

    public PetrolAuto(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume) {
        super(producer, model, EngineType.PETROL);
        this.availablePetrol = availablePetrol;
        this.tankVolume = tankVolume;
    }

    public int getAvailablePetrol() {
        return availablePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setAvailablePetrol(int availablePetrol) {
        this.availablePetrol = availablePetrol;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
