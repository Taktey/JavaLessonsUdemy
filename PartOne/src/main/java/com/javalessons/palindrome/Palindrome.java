package com.javalessons.palindrome;

import java.util.Scanner;

public class Palindrome {

    public boolean isPalindrome(int candidate) {
        return this.isPalindrome(Integer.toString(candidate));
    }

    public boolean isPalindrome(String candidate) {
        boolean result = true;
        int leftDigit = candidate.length() - 1;
        for (int rightDigit = 0; rightDigit < leftDigit; rightDigit++) {
            if (candidate.charAt(rightDigit) != candidate.charAt(leftDigit)) {
                result = false;
            }
            leftDigit--;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();
        System.out.println("Lets test string for palindrome:");
        System.out.printf("Is it palindrome? - %b \n", palindrome.isPalindrome(scan.next()));
        System.out.println("Lets test number for palindrome:");
        System.out.printf("Is it palindrome? - %b \n", palindrome.isPalindrome(scan.nextInt()));
    }
}
