package com.muditasoft.junit5._01basics.fibonacci;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 1 2 3 4 5 6 7
// 1 1 2 3 5 8 13

public class FibonacciTest {

    @Test
    @DisplayName("Find Fibonacci Numbers for Specific Order")
    void findFibonacciNumbers() {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();

        assertThrows(IllegalArgumentException.class, () -> fibonacciNumber.find(0));

        assertAll("Fibonacci Numbers",
                () -> assertEquals(1, fibonacciNumber.find(1)),
                () -> assertEquals(1, fibonacciNumber.find(2)),
                () -> assertEquals(2, fibonacciNumber.find(3)),
                () -> assertEquals(3, fibonacciNumber.find(4)),
                () -> assertEquals(5, fibonacciNumber.find(5)),
                () -> assertEquals(8, fibonacciNumber.find(6)),
                () -> assertEquals(13, fibonacciNumber.find(7))
                );
    }
}
