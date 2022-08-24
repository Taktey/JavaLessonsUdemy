package com.javalessons.oop.gettersetterconstructor;

import com.javalessons.oop.gettersetterconstructor.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Jack", 5, false);
        dog.setAge(3);
        System.out.println(dog.getAge());
        dog.setName("Wolfie");
        System.out.println(dog.getName());
        dog.setAgressive(true);
        System.out.println(dog.getAgressive());

    }
}
