package org.ac;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            System.out.println("Out of range!");
            return false;
        } else if ((year % 4) == 0) {
            if ((year % 100 ) == 0) {
                if ((year % 400) == 0) {
                    System.out.println(year + " is a leap year.");
                    return true;
                }
                System.out.println(year + " is not a leap year.");
                return false;
            }
            System.out.println(year + " is a leap year.");
            return true;
        }
        System.out.println(year + " is not a leap year.");
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((year <= 1 || year >= 9999) || (month < 1 || month > 12)) {
            System.out.println("Out of range!");
            return -1;
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("31 days");
                    return 31;
                case 2:
                    if (((year % 4) == 0) && !((year % 100 ) == 0) || ((year % 100 ) == 0)) {
                        System.out.println("29 days");
                        return 29;
                    } else {
                        System.out.println("28 days");
                        return 28;
                    }
                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    return 30;
                default:
                    System.out.println("Error");
                    return -1;
            }
        }
    }
}
