package com.javalessons.collections.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("String1");
        list.add("String2");
        list.add("String3");
        System.out.println(list);
        list.add(1, "New String2");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("String1"));
        list.addFirst("String First");
        list.addLast("String Last");
        System.out.println(list.peekFirst() + ", " + list.peekLast());
        System.out.println(new LinkedList<>());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list);

        String[] array = list.toArray(new String[3]);
        for (String string : array) {
            System.out.print(string + ", ");
        }
        list.add("qwe2");
        list.add("qwe");
        list.add("qwe5");
        list.add("qwe");
        list.add("qwe1");
        list.add("qwe3");
        list.add("qwe1");
        list.add("qwe4");
        list.add("qwe1");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String currentElement = iterator.next();
            if(currentElement.equals("qwe1")){
                iterator.remove();
            }
        }
        System.out.println("\n"+list);
    }
}
