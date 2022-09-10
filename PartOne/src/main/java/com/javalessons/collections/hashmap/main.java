package com.javalessons.collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // All keys in HashMap always unique
        map.put(1, "abc");
        map.put(1, "def"); // Using key, which is already used leads to rewriting value
        map.put(2, "abc");
        map.put(3, "def"); // Values may be repeated
        System.out.println(map);
        String abc = map.get(2);
        System.out.println(abc);
        System.out.println(map.remove(3));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("def"));

        map.put(1, "abc");
        map.put(1, "def");
        map.put(2, "abc");
        map.put(3, "def");
        Set<Integer> keys = map.keySet();
        System.out.println("keys: " + keys);
        ArrayList<String> values = new ArrayList<>(map.values());
        System.out.println("Values: "+ values);
    }
}
