package com.javalessons.exceptions;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandingMain {

    public static void main(String[] args) /*throws IOException*/ {

        try {
            doEverything();
        } catch (InvalidInputParamException e) {
            System.out.println("InvalidInputParamException");
            e.printStackTrace();
        }
    }

    private static void doEverything() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        //PrintWriter writer = null;
        do {
            try (PrintWriter writer = new PrintWriter(new FileWriter("res.txt"));
                 BufferedReader reader = new BufferedReader(new FileReader("123"))) {
                System.out.println("Please enter numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please enter denominator");
                int denominator = scanner.nextInt();
                System.out.println(divide(numerator, denominator));
                //int[] array = new int[1];
                //int i = array[2];
                //writer = new PrintWriter(new FileWriter("res.txt"));
                writer.println("Result = " + divide(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception: " + e);
                scanner.nextLine();
                System.out.println("Only integer non-zero parameters allowed");
            } /*catch (InputMismatchException e) {
                System.out.println("Exception: " + e);
                scanner.nextLine();
                System.out.println("Only integer values allowed");
            } */ catch (IOException e) {
                System.out.println("Unable to open file");
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new InvalidInputParamException("Array index is out of bounds in doEverything(): " + e);
            } catch (Exception e) {
                System.out.println("All exceptions");
            } finally {
                System.out.println("Finally block called");
            }
        } while (continueLoop);
        System.out.println("Try catch block finished");
    }

    private static int divide(int numerator, int denominator) /*throws ArithmeticException, NullPointerException*/ {
        return numerator / denominator;
    }

    private static void saveToFile(int res) throws IOException {

    }
}
