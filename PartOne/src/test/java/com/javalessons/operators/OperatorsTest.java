package com.javalessons.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorsTest {
    Operators operators = new Operators();

    @Test
    void sum() {
        float expected = 25.8f;
        float actual = operators.sum(10.2f,15.6f);
        assertEquals(expected,actual);
    }

    @Test
    void subtraction() {
        float expected = 6.2f;
        float actual = operators.subtraction(10.2f,4);
        assertEquals(expected,actual);
    }

    @Test
    void multiplication() {
        float expected = 18.2f;
        float actual = operators.multiplication(2,9.1f);
        assertEquals(expected,actual,0.01f);
    }

    @Test
    void division() {
        float expected = 3.1f;
        float actual = operators.division(9.3f,3);
        assertEquals(expected,actual,0.01f);
    }
    @Test
    void divisionByZero() {
        String expected = "Infinity";
        String actual = Float.toString(operators.division(9.3f,0));
        assertEquals(expected,actual);
    }
}