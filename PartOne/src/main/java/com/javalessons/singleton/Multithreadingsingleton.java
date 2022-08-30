package com.javalessons.singleton;

public class Multithreadingsingleton {
    public static volatile Multithreadingsingleton instance;

    private Multithreadingsingleton() {
    }

    public static Multithreadingsingleton getInstance() {
        if (instance == null) {
            synchronized (Multithreadingsingleton.class) {
                if (instance == null) {
                    instance = new Multithreadingsingleton();
                }
            }
        }

        return instance;
    }
}
