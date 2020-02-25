package org.ac;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int initial = number;
        if (number < 0) {
            System.out.println("Out of range!");
            return -1;
        }
        int sum = 0;
        int evenDigit;

        while (number > 0) {
            evenDigit = number % 10;
            if (evenDigit % 2 == 0) {
                sum += evenDigit;
            }
            number /= 10;
        }
        System.out.println("Sum of the even digits of number " + initial + " is: " + sum);
        return sum;
    }
}
