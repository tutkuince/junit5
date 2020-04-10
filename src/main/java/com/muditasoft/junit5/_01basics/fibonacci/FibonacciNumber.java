package com.muditasoft.junit5._01basics.fibonacci;

public class FibonacciNumber {
    // 1 2 3 4 5 6 7
    // 1 1 2 3 5 7 12
    public int find(int order) {

        if (order <= 0) {
            throw new IllegalArgumentException();
        }

        if (order == 1 || order == 2)
            return 1;

        return find(order - 2) + find(order -  1);
    }
}
