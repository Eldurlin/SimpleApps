package org.ac;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            System.out.println("Invalid value!");
            return -1;
        } else {
            int largestPrimeNumber = 2;
            int num = number;

            while (num != 1) {
                if (num % largestPrimeNumber == 0) {
                    num /= largestPrimeNumber;
                } else {
                    largestPrimeNumber++;
                }
            }
            System.out.println("The largest prime number of " + number + " is: " + largestPrimeNumber);
            return largestPrimeNumber;
        }
    }

    public static boolean isPrime(int number) {
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            temp = number % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
