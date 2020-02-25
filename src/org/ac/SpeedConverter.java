package org.ac;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversionKilometers(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value!");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static long toKilometersPerHour(double milesPerHour) {
        if (milesPerHour < 0) {
            return -1;
        }
        return Math.round(milesPerHour * 1.609);
    }

    public static void printConversionMiles(double milesPerHour) {
        if (milesPerHour < 0) {
            System.out.println("Invalid value!");
        } else {
            long kilometersPerHour = toKilometersPerHour(milesPerHour);
            System.out.println(milesPerHour + " mi/h = " + kilometersPerHour + " km/h");
        }
    }
}
