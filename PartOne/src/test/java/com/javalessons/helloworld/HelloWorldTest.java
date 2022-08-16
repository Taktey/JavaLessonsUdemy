package com.javalessons.helloworld;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void isGetHelloMessageReturnsExpectedMessage() {
        HelloWorld helloWorld = new HelloWorld();
        String expected = "Hello World!";
        String actual = helloWorld.getHelloMessage();
        assertEquals(expected, actual);
    }
}