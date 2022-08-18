package com.javalessons.palindrome;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PalindromeParameterizedTest {
    Palindrome palindrome = new Palindrome();
    boolean expected;
    String stringCandidate;
    int intCandidate;

    public PalindromeParameterizedTest(boolean expected, String stringCandidate, int intCandidate) {
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
        boolean actualForString = palindrome.isPalindrome(stringCandidate);
        boolean actualForInt = palindrome.isPalindrome(intCandidate);
        assertEquals(expected, actualForString);
        assertEquals(expected, actualForInt);
    }
}