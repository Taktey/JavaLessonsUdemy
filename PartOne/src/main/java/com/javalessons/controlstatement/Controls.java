package com.javalessons.controlstatement;

import java.util.Scanner;

public class Controls {

    public int gradeConvertorHundredToFivePointSystem(int grade) {
        if (81 <= grade && grade <= 100) return 5;
        if (65 <= grade && grade <= 80) return 4;
        if (51 <= grade && grade <= 64) return 3;
        if (0 <= grade && grade <= 50) return 2;
        else return -1;
    }

    public static void main(String[] args) {
        //Convertor 100- to 5-point grade system, using if/else
        Controls controls = new Controls();
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert grade in 100-point grade system: ");
        int gradeInHundredPointSystem = scan.nextInt();
        int gradeInFivePointSystem
                = controls.gradeConvertorHundredToFivePointSystem(gradeInHundredPointSystem);
        if (gradeInFivePointSystem == -1)
            System.out.println("Input Error, use grade from 0 to 100");
        else System.out.printf("Your grade in 5-point system is %d!", gradeInFivePointSystem);
    }
}
