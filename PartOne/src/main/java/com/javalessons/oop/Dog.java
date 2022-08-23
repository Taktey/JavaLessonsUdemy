package com.javalessons.oop;

public class Dog {
    private String name;
    private int age;
    private boolean agressive;

    public Dog(String name, int age, boolean agressive) {
        this.name = name;
        this.age = age;
        this.agressive = agressive;
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
