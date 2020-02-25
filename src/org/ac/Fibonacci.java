package org.ac;

public class Fibonacci {
    public static int fibonacci(int number) {
        return number < 2 ? number : fibonacci(number - 1) + fibonacci(number - 2);
    }
}
