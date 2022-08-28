package com.javalessons.enumeration;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setSize(Size.BIG);
        dog.bark();

        Dog dog2 = new Dog();
        dog2.setSize(Size.AVERAGE);
        dog2.bark();

        Dog dog3 = new Dog();
        dog3.setSize(Size.SMALL);
        dog3.bark();

        Dog dog4 = new Dog();
        dog4.bark();

        Size s = Size.SMALL;
        System.out.println(s.toString()); // print ENUM element as a String
        System.out.println(s); // also print ENUM element as a String
        Size s1 = Size.valueOf("BIG"); //initialization via String value
        System.out.println(s1);
        System.out.println("____________________________________");
        Size[] values = Size.values(); // Get collection of ENUM elements
        for(int i=0; i< values.length;i++){
            System.out.println(values[i]);
        }

    }
}
