package com.javalessons.chapter1attestation.task2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Напишите программу, которая принимает заранее неизвестное количество оценок
 * считает общую сумму оценок и среднее значение.
 * Оценки должны быть получены с консоли и от запуска к запуску их количество может меняться.
 * Для этого вам понадобится один из циклических операторов с заранее не известным количеством циклов.
 * Вспомните, какие бывают циклические операторы и в чем особенность каждого из них.
 * Так же вам понадобится определенное значение, которое будет обозначать завершение обработки
 * входящих данных и переход к вычислениям. Так как оценки не могут быть отрицательными,
 * можно использовать отрицательное целое значение (например -1 или -5) как указатель выхода из цикла.
 * <p>
 * Для выполнения задания Вам понадобится класс Scanner.
 * Создайте объект класса <code> Scanner scanner = new Scanner(System.in);</code>
 * Используя методы этого класса, Вы можете прочитать с консоли данные разного типа.
 * <code>
 * scanner.nextInt();
 * scanner.nextDouble();
 * scanner.nextLine();
 * scanner.nextFloat();
 * scanner.next();
 * </code>
 * <p>
 * После выполнения задания сверьтесь с тем что написано в  GradeCalculatorSolution.java.
 * <p>
 * Подумайте какие есть недостатки у решения в классе GradeCalculatorSolution.
 * <p>
 * Вам нужно предложить 2 улучшения. По желанию можно реализовать их самостоятельно (не обязательно).
 * Подсказка: одно из них реализовать очень просто.
 * Для второго Вам могут понадобиться знания из раздела Обработка исключений в Java.
 */
public class GradeCalculatorTask {
    public int getAmount(ArrayList<Integer> grades) {
        int amount = 0;
        for (int i : grades) {
            amount = amount + i;
        }
        return amount;
    }

    public double getAverage(ArrayList<Integer> grades) {
        return this.getAmount(grades) / grades.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeCalculatorTask gradeCalculatorTask = new GradeCalculatorTask();
        boolean cycleControl = true;
        int grade;
        ArrayList<Integer> grades = new ArrayList<Integer>();
        while (cycleControl) {
            System.out.println("Insert scale from 0 to 5 (use other values to end input):");
            grade = scanner.nextInt();
            if (grade >= 0 && grade <= 5) {
                grades.add(grade);
            } else cycleControl = false;
        }
        System.out.println("Amount is " + gradeCalculatorTask.getAmount(grades));
        System.out.println("Average is " + gradeCalculatorTask.getAverage(grades));
    }
}
