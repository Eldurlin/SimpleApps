package org.ac;

public class SumOdd {
    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || start <= 0) {
            System.out.println("Invalid value!");
            return -1;
        } else {
            int sum = 0;
            for (int i = 0; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                    System.out.println("Found number = " + i);
                }
            }
            System.out.println("Sum = " + sum);
            return sum;
        }
    }
}
