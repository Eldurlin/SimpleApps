package org.ac;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = number; i > 0; i--) {
                for (int j = number; j > 0; j--) {
                    if (i == 1 || i == number || j == i || j == number - i + 1 || j == 1 || j == number) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}