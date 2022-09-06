package com.javalessons.collections.arraylist;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        boolean isAdded = arrayList.add("Some string");
        System.out.println(isAdded+", "+ arrayList.get(0));
        arrayList.add(0, "Some other string");
        System.out.println(arrayList.get(0));
        System.out.printf("Array size is %d\n", arrayList.size());

        ArrayList<String> arrayList1 = new ArrayList<>(arrayList);
        System.out.println("\nElements of second array:");
        for(String string: arrayList1){
            System.out.println(string);
        }

        arrayList1.clear();
        System.out.println("\nElements of second array after clearing:");
        for(String string: arrayList1){
            System.out.println(string);
        }

        ArrayList<String> arrayList2 = (ArrayList<String>) arrayList.clone();
        System.out.println("\nElements of the cloned array:");
        for(String string: arrayList2){
            System.out.println(string);
        }
        boolean isContains = arrayList2.contains("Some string");
        System.out.println(isContains);
    }
}
