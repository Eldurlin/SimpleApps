package org.ac;

public class SumOfDigits {
    public static int sumDigits(int number) {
        if (number < 10) {
            System.out.println("Invalid value! Change it!");
            return -1;
        } else {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            System.out.println("Sum of the digits number: " + sum);
            return sum;
        }
    }
}
