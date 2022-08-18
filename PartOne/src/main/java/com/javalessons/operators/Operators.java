package com.javalessons.operators;

import java.util.Scanner;

public class Operators {
    public float sum(float firstValue, float secondValue) {
        return firstValue + secondValue;
    }

    public float subtraction(float firstValue, float secondValue) {
        return firstValue - secondValue;
    }

    public float multiplication(float firstValue, float secondValue) {
        return firstValue * secondValue;
    }

    public float division(float firstValue, float secondValue) {
        return firstValue / secondValue;
    }

    public static void main(String[] args) {
        Operators operator = new Operators();
        Scanner scan = new Scanner(System.in);
        System.out.println("Add first value");
        float firstValue = scan.nextFloat();
        System.out.println("Add second value");
        float secondValue = scan.nextFloat();
        System.out.println("Add operator (+,-,*,/)");
        String action = scan.next();
        float result = -999999999;
        switch (action) {
            case ("+"):
                result = operator.sum(firstValue, secondValue);
                break;
            case ("-"):
                result = operator.subtraction(firstValue, secondValue);
                break;
            case ("*"):
                result = operator.multiplication(firstValue, secondValue);
                break;
            case ("/"):
                try {
                    result = operator.division(firstValue, secondValue);
                } catch (Exception e) {
                    System.out.println("Error, check your values and try again");
                }
                break;
            default:
                System.out.println("Error, operator hasn't been selected, try again");
        }
        System.out.println("result= " + result);
    }
}
