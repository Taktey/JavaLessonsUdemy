package com.javalessons.oop.inheritance;

public class ElectricCar extends Auto {
    private int batteryVolume;
    private int passengersNumber;

    public void charge(){
        System.out.println("Battery is charging");
    }

    public ElectricCar(String producer, String model, int batteryVolume, int passengersNumber) {
        super(producer, model, EngineType.Electric);
        this.batteryVolume = batteryVolume;
        this.passengersNumber = passengersNumber;
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }
}
