package com.muditasoft.unittest;

public class FizzBuzz {
    public String stringFor(int number) {

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        return null;
    }
}
