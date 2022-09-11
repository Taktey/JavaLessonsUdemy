package com.javalessons.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); // initialCapacity = 16, loadFactor = 0.75
        /* Constructors:
        (int initialCapacity), (int initialCapacity, float loadFactor), (Collection C)
         */
        set.add("String1");
        set.add("String2");
        set.add("String3");
        set.add("String1");
        System.out.println(set);
        System.out.println(set.contains("String2"));
        set.remove("String2");
        System.out.println(set.contains("String2"));
        set.clear();
        System.out.println(set.isEmpty());
    }
}
