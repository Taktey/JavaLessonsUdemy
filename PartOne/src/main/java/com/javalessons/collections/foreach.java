package com.javalessons.collections;

public class foreach {
    public static void main(String[] args) {
        int count = 0;
        String[] strings = new String[5];
        for (int i=0;i<5;i++) {
            strings[i] = "This is string number " + count;
            count++;
        }

        for (String string : strings) {
            System.out.println(string);
        }

    }
}
