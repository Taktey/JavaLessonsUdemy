package com.javalessons.helloworld;

public class HelloWorld {
    public String getHelloMessage() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.getHelloMessage());
    }
}
