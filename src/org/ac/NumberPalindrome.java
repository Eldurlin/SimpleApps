package org.ac;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int initial = number;
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        if (reverse == initial) {
            System.out.println(initial + " is a palindrome.");
            return true;
        } else {
            System.out.println(initial + " is not a palindrome.");
            return false;
        }
    }
}
