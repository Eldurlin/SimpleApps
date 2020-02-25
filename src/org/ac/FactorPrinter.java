package org.ac;

public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid value!");
        } else {
            int factor = 0;
            System.out.println("All factors of " + number + ": ");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    factor = i;
                    System.out.print(factor + " ");
                }
            }
        }
    }
}
