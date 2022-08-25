package com.javalessons.oop.usingstatic;

public class Dog {

    static int dogsCount = 0;
    // Static int dogCount is an attribute of the class, not instance.
    // It is common for every instance of the class
    private String name;
    private int age;
    private boolean agressive;

    public Dog(String name, int age, boolean agressive) {
        this.name = name;
        this.age = age;
        this.agressive = agressive;
        dogsCount++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getAgressive() {
        return agressive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAgressive(boolean agressive) {
        this.agressive = agressive;
    }
}
