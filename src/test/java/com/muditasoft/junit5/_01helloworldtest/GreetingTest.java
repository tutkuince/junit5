package com.muditasoft.junit5._01helloworldtest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before - I am only called Once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In @BeforeEach. . .");
        greeting = new Greeting();
    }

    @AfterEach
    void tearDown() {
        System.out.println("In @AfterEach. . .");
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Tutku"));
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After - I am only called Once!!!");
    }
}