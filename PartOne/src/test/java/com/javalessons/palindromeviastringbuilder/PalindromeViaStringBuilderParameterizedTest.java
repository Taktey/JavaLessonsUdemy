package com.javalessons.palindromeviastringbuilder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PalindromeViaStringBuilderParameterizedTest {
    PalindromeViaStringBuilder palindromeViaStringBuilder = new PalindromeViaStringBuilder();
    boolean expected;
    String stringCandidate;
    int intCandidate;

    public PalindromeViaStringBuilderParameterizedTest(boolean expected, String stringCandidate, int intCandidate) {
        this.expected = expected;
        this.stringCandidate = stringCandidate;
        this.intCandidate = intCandidate;
    }

    @Parameterized.Parameters(name = "Candidate: {1}, {2}, Result: {0}")
    public static Object[][] getData() {
        return new Object[][]{
                {true, "qweewq", 123321},
                {true, "q", 1},
                {true, "qwwq", 1221},
                {false, "qwe", 123},
                {false, "qwwe", 1234},
        };
    }

    @Test
    public void isPalindromeStringTest() {
        boolean actualForString = palindromeViaStringBuilder.isPalindrome(stringCandidate);
        boolean actualForInt = palindromeViaStringBuilder.isPalindrome(intCandidate);
        System.out.println(stringCandidate + " " + actualForString + "\n" + intCandidate + " " + actualForInt);
        assertEquals(expected, actualForString);
        assertEquals(expected, actualForInt);
    }
}

