package com.javalessons.collections.sorting;

import java.util.Random;

public class Bubble {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        int temporaryVault;
        System.out.println("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        // Bubble sorting
        for (int j = 0; j < numbers.length; j++) {
            for (int k = 0; k < numbers.length; k++) {
                if (numbers[j] < numbers[k]) {
                    temporaryVault = numbers[j];
                    numbers[j] = numbers[k];
                    numbers[k] = temporaryVault;
                }
            }
        }
        System.out.println("Sorting result: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }
}
