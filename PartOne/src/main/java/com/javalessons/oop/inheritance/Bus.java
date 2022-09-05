package com.javalessons.oop.inheritance;

public class Bus extends PetrolAuto {

    private int passengerNumber;

    public Bus(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus initialized");
    }

    public void pickUpPassengers(int passengerNumber) {
        this.passengerNumber += passengerNumber;
        System.out.printf("Picking up %s passengers", passengerNumber);
    }

    public void releasePassengers() {
        if (isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers released");
    }

    public void fuelUp(){
        int volume = getTankVolume()-getAvailablePetrol();
        fuelUp(20);
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol()+petrolVolume;
        if(volume>getTankVolume()){
            setAvailablePetrol(getTankVolume());
        }
    }
}
