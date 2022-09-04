package com.javalessons.chapter2attestation;

public class MortgageCalc {
    public static void main(String[] args) {
        Calc calc = new Calc(1000000, 5, 0.1f, 10000);
        calc.getCreditPlan();
    }
}
