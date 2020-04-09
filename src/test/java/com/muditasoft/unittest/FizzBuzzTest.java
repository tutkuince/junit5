package com.muditasoft.unittest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void returnFizzWhenTheNumberIsDividedByThree() {
        assertEquals("Fizz", fizzBuzz.stringFor(3));
    }

    @Test
    void returnBuzzWhenTheNumberIsDividedByFive() {
        assertEquals("Buzz", fizzBuzz.stringFor(5));
    }

    @Test
    void returnFizzBuzzWhenTheNumberIsDividedByBothOfThreeAndFive() {
        assertEquals("FizzBuzz", fizzBuzz.stringFor(15));
    }

    @Test
    void returnTheNumberItselfWhenTheNumberIsNotDividedAnyOfThreeOfFive() {
        assertEquals("7", fizzBuzz.stringFor(7));
    }
}
