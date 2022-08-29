package com.javalessons.singleton;

// Simple singleton pattern realisation
public class SimpleSingleton {
    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        return INSTANCE;
    }
}
