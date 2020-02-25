package org.ac;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?\n"
                + "1. Convert miles per hour to kilometers per hour (type 1)\n"
                + "2. Convert kilometers per hour to miles per hour (type 2)\n"
                + "3. Calculate bytes into megabytes (type 3)\n"
                + "4. Leap year (type 4)\n"
                + "5. Area of circle calculator (type 5)\n"
                + "6. Area of rectangle calculator (type 6)\n"
                + "7. Calculate minutes into years (type 7)\n"
                + "8. Get days in a month (type 8)\n"
                + "9. Odd numbers and sum of them in range (type 9)\n"
                + "10. Is number a palindrome (type 10)\n"
                + "11. First and last digit sum of number (type 11)\n"
                + "12. Even digit sum of number (type 12)\n"
                + "13. Have two numbers a shared digit (type 13)\n"
                + "14. Greatest common divisor of two numbers (type 14)\n"
                + "15. All factors of the number (type 15)\n"
                + "16. The perfect number (type 16)\n"
                + "17. The largest prime number (type 17)\n"
                + "18. Diagonal star (type 18)\n"
                + "19. Sum of the digits (type 19)\n"
                + "20. Fibonacci (type 20)\n"
                + "0. End program\n");
        System.out.print("Your choice: ");
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            System.out.println("1. Convert miles per hour to kilometers per hour\n");
            System.out.print("Type speed value: ");
            long speed = scanner.nextLong();
            SpeedConverter.printConversionMiles(speed);
        } else if (userInput == 2) {
            System.out.println("2. Convert kilometers per hour to miles per hour\n");
            System.out.print("Type speed value: ");
            long speed = scanner.nextLong();
            SpeedConverter.printConversionKilometers(speed);
        } else if (userInput == 3) {
            System.out.println("3. Calculate bytes into megabytes\n");
            System.out.print("Type bytes value: ");
            int bytes = scanner.nextInt();
            BytesConverter.printMegaAndKiloBytes(bytes);
        } else if (userInput == 4) {
            System.out.println("4. Leap year\n");
            System.out.print("Type year value: ");
            int year = scanner.nextInt();
            LeapYear.isLeapYear(year);
        } else if (userInput == 5) {
            System.out.println("5. Area of circle calculator\n");
            System.out.print("Type radius value: ");
            double radius = scanner.nextDouble();
            AreaCalc.area(radius);
        } else if (userInput == 6) {
            System.out.println("5. Area of rectangle calculator\n");
            System.out.print("Type x value: ");
            double x = scanner.nextDouble();
            System.out.print("Type y value: ");
            double y = scanner.nextDouble();
            AreaCalc.area(x, y);
        } else if (userInput == 7) {
            System.out.println("7. Calculate minutes into years\n");
            System.out.print("Type minutes value: ");
            long minutes = scanner.nextLong();
            MinutesToYearAndDaysCalc.printYearsAndDays(minutes);
        } else if (userInput == 8) {
            System.out.println("8. Get days in a month\n");
            System.out.print("Type year value: ");
            int year = scanner.nextInt();
            System.out.print("Type month value: ");
            int month = scanner.nextInt();
            LeapYear.getDaysInMonth(month, year);
        } else if (userInput == 9) {
            System.out.println("9. Odd numbers and sum of them in range\n");
            System.out.print("Type start range value: ");
            int start = scanner.nextInt();
            System.out.print("Type end range value: ");
            int end = scanner.nextInt();
            SumOdd.sumOdd(start, end);
        } else if (userInput == 10) {
            System.out.println("10. Is number a palindrome\n");
            System.out.print("Type a number: ");
            int number = scanner.nextInt();
            NumberPalindrome.isPalindrome(number);
        } else if (userInput == 11) {
            System.out.println("11. First and last digit sum of number\n");
            System.out.print("Type a number: ");
            int number = scanner.nextInt();
            FirstLastDigitSum.sumFirstLastDigit(number);
        } else if (userInput == 12) {
            System.out.println("12. Even digit sum of number\n");
            System.out.print("Type a number: ");
            int number = scanner.nextInt();
            EvenDigitSum.getEvenDigitSum(number);
        } else if (userInput == 13) {
            System.out.println("13. Have two numbers a shared digit\n");
            System.out.print("Type first number in range 10-99: ");
            int num1 = scanner.nextInt();
            System.out.print("Type second number in range 10-99: ");
            int num2 = scanner.nextInt();
            SharedDigit.hasSharedDigit(num1, num2);
        } else if (userInput == 14) {
            System.out.println("14. Greatest common divisor of two numbers\n");
            System.out.print("Type first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Type second number: ");
            int num2 = scanner.nextInt();
            GreatestCommonDivisor.getGreatestCommonDivisor(num1, num2);
        } else if (userInput == 15) {
            System.out.println("15. All factors of the number\n");
            System.out.print("Type a number: ");
            int number = scanner.nextInt();
            FactorPrinter.printFactors(number);
        } else if (userInput == 16) {
            System.out.println("16. The perfect number\n");
            System.out.print("Type a number: ");
            int number = scanner.nextInt();
            PerfectNumber.isPerfectNumber(number);
        } else if (userInput == 17) {
            System.out.println("17. The largest prime number\n");
            System.out.print("Type a number: ");
            int number = scanner.nextInt();
            LargestPrime.getLargestPrime(number);
        } else if (userInput == 18) {
            System.out.println("18. Diagonal star\n");
            System.out.print("Type a number greater than 5: ");
            int number = scanner.nextInt();
            DiagonalStar.printSquareStar(number);
        } else if (userInput == 19) {
            System.out.println("19. Sum of the digits\n");
            System.out.print("Type a number: ");
            int number = scanner.nextInt();
            SumOfDigits.sumDigits(number);
        } else if (userInput == 20) {
            System.out.println("20. Fibonacci\n");
            System.out.print("Type a number: ");
            int number = scanner.nextInt();
            System.out.println("Fibonacci series of " + number + " numbers: ");
            for (int i = 0; i < number; i++) {
                System.out.print(Fibonacci.fibonacci(i) + " ");
            }
        } else if (userInput == 0) {
            System.out.println("Exiting program...");
        } else {
            System.out.println("There is no other option.");
        }
    }
}
