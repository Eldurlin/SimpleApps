package org.ac;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 < 10) {
            System.out.println("Invalid value!");
            return -1;
        } else {
            int commonDivisor = 0;
            for (int i = 1; i <= num1; i++) {
                if ((num1 % i == 0) && (num2 % i == 0)) {
                    commonDivisor = i;
                }
            }
            System.out.println("Greatest common divisor of " + num1 + " and " + num2 + " is: " + commonDivisor);
            return commonDivisor;
        }
    }
}
