package com.javalessons.controlstatement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlsTest {

    Controls controls = new Controls();

    @Test
    void isGradeConvertorHundredToFivePointSystemReturnsCorrectGradePositive() {
        int expected = 3;
        int actual = controls.gradeConvertorHundredToFivePointSystem(56);
        assertEquals(expected,actual,"Positive test failed");
    }

    @Test
    void isGradeConvertorHundredToFivePointSystemReturnsCorrectGradeNegative() {
        int expected = -1;
        int actual = controls.gradeConvertorHundredToFivePointSystem(101);
        assertEquals(expected,actual,"Negative test failed");
    }
}