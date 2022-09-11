package com.javalessons.oop.inheritance.composition;


public class Auto {
    private String producer;
    private String model;
    private Engine engine;

    public Auto(String producer, String model, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
    }
}
