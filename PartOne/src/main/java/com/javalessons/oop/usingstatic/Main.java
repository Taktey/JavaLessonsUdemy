package com.javalessons.oop.usingstatic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sharky", 4, true);
        Dog dog2 = new Dog("Barky", 5, false);
        Dog dog3 = new Dog("Toby", 3, false);
        System.out.println("You need at least 5 dogs to control sheep herd. Do you have enough?");
        if (Dog.dogsCount < 5) {
            System.out.printf("No, i have only %d dogs! \n", Dog.dogsCount);
            while (Dog.dogsCount < 5) {
                System.out.println("I will buy additional dog!");
                Dog dog4 = new Dog("Name", 6, false);
            }
            System.out.printf("Now I have %d dogs, should be enough!\n", Dog.dogsCount);
        } else System.out.printf("I have %d dogs, should be enough!\n", Dog.dogsCount);
        System.out.println("Fine, hope you won't lose their links");
        System.out.println("Oops!");
    }
}
