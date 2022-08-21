package com.javalessons.chapter1attestation.task1;

import java.util.Scanner;

/**
 * Напишите программу которая принимает 3 числовых значения и проверяет, могут ли они быть
 * сторонами треугольника.
 * Для ввода значений с консоли Вам понадобится класс Scanner.
 * <code>Scanner scanner = new Scanner(System.in);</code>
 * <code>scanner.nextInt();</code>
 */
public class TriangleTask {
    public int[] sortSidesList(int[] sides) {
        int listLength = sides.length;
        int temporaryVariable;
        for (byte i = 0; i < listLength - 1; i++) {
            if (sides[i] > sides[i + 1]) {
                temporaryVariable = sides[i];
                sides[i] = sides[i + 1];
                sides[i + 1] = temporaryVariable;
            }
        }
        return sides;
    }

    public boolean isRealTriangle(int[] sides) {
        sides = this.sortSidesList(sides);
        if (sides[2] < sides[0] + sides[1]) {
            return true;
        } else return false;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 integer numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] sides = {a, b, c};
        TriangleTask triangleTask = new TriangleTask();
        if (triangleTask.isRealTriangle(sides)) {
            System.out.printf("You can create a triangle with sides %d %d %d\n", a, b, c);
        } else {
            System.out.printf("You cannot create a triangle with sides %d %d %d\n", a, b, c);
        }
    }
}

