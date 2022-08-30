package com.javalessons.oop.classobjectmethods;

// Each is an inheritor of Object class, it means, each java class can use Object class methods

public class Main {
    public static void main(String[] args) {
        Dog charlie = new Dog("Charlie", 4, "mongrel", false);

        String dogToString = charlie.toString();
        System.out.println(dogToString);
        // toString() let us get full name of the object

        int dogHashCode = charlie.hashCode();
        System.out.println(dogHashCode);
        // hashCode() let us get hash code of the object

        Class dogClass = charlie.getClass();
        System.out.println(dogClass);
        // getClass() let us know, which class object belongs to

        boolean isEquals = charlie.equals(new Dog("Bobik", 3, "mongrel", true));
        boolean isEquals2 = "qwe".equals("qwe");
        System.out.println(isEquals + ", " + isEquals2);
        // equals() let us compare objects, using "==" ineffective in some situations

    }
}
