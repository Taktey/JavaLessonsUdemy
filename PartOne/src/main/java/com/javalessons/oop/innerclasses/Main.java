package com.javalessons.oop.innerclasses;

public class Main {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone("Nokia", "E65");
        phone.turnOn();
        Display display = phone.getDisplay();
        // Display.Pixel pixel = display.new Pixel(100, 100, Display.Color.RED); Works if Pixel not static
        Display.Pixel pixel2 = new Display.Pixel(100, 100, Display.Color.RED);
    }
}
