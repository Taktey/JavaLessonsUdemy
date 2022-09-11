package com.javalessons.oop.inheritance.composition;

import java.util.ArrayList;
import java.util.List;

public class Engine {

    private double volume;
    private EngineType engineType;
    private int power;
    private List<Piston> pistons = new ArrayList<>();

    public Engine(double volume, EngineType engineType, int power) {
        this.volume = volume;
        this.engineType = engineType;
        this.power = power;
        for (int i = 0; i <= 4; i++) {
            this.pistons.add(new Piston(0.5, i));
        }
    }

}
