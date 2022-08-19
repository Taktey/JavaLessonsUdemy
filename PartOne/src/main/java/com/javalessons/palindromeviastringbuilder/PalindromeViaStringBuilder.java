package com.javalessons.palindromeviastringbuilder;

import java.util.Scanner;

public class PalindromeViaStringBuilder {
    public boolean isPalindrome(int candidate) {
        return this.isPalindrome(Integer.toString(candidate));
    }

    public boolean isPalindrome(String candidate) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(candidate);
        StringBuilder stringBuilderReversed = new StringBuilder();
        stringBuilderReversed.append(candidate).reverse();
        if (stringBuilder.toString()
                .equals(stringBuilderReversed.toString())) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PalindromeViaStringBuilder palindromeViaStringBuilder = new PalindromeViaStringBuilder();
        System.out.println("Lets test string for palindrome:");
        System.out.printf("Is it palindrome? - %b \n", palindromeViaStringBuilder.isPalindrome(scan.next()));
        System.out.println("Lets test number for palindrome:");
        System.out.printf("Is it palindrome? - %b \n", palindromeViaStringBuilder.isPalindrome(scan.nextInt()));
    }
}

