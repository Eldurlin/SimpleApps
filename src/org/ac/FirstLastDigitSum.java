package org.ac;

public class FirstLastDigitSum {
    public static int sumFirstLastDigit(int number) {
        int initial = number;
        if (number < 0) {
            System.out.println("Out of range!");
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number != 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        int sum = firstDigit + lastDigit;
        System.out.println("Sum of the first and last digit of " + initial + " is: " + sum);
        return firstDigit + lastDigit;
    }
}
