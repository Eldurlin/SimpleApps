package org.ac;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)) {
            System.out.println("Invalid number");
            return false;
        } else {
            while (num1 != 0) {
                int num22 = num2;
                while (num22 != 0) {
                    if (num1 % 10 == num22 % 10) {
                        System.out.println(num1 + " and " + num2 + " has a shared digit.");
                        return true;
                    }
                    num22 /= 10;
                }
                num1 /= 10;
            }
        }
        System.out.println(num1 + " and " + num2 + " has not a shared digit.");
        return false;
    }
}
