package org.ac;

public class AreaCalc {
    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Invalid value!");
            return -1.0;
        } else {
            double area = Math.PI * radius * radius;
            System.out.println("Area of circle: " + area);
            return area;
        }
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            System.out.println("Invalid value!");
            return -1;
        } else {
            double area = x * y;
            System.out.println("Area of rectangle: " + area);
            return area;
        }
    }
}
