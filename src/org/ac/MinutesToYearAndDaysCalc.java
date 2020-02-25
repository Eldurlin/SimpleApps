package org.ac;

public class MinutesToYearAndDaysCalc {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value!");
        } else {
            long years = minutes / 525600;
            long days = (minutes / 1440) % 365;
            System.out.println(minutes + " min = " + years + " years and " + days + " days.");
        }
    }
}
