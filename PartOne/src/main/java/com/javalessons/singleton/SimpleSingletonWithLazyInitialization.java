package com.javalessons.singleton;
// Singleton realisation with "lazy" initialization

public class SimpleSingletonWithLazyInitialization {
    private static SimpleSingletonWithLazyInitialization INSTANCE;

    private SimpleSingletonWithLazyInitialization() {
    }

    public static SimpleSingletonWithLazyInitialization getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new SimpleSingletonWithLazyInitialization();
        }
        return INSTANCE;
    }
}
