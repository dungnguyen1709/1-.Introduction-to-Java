

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        boolean isLeapYear = false;
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        boolean isDivisibleBy4 =  year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf(" %d is a leap year ", year);
        } else {
            System.out.printf(" %d is NOT a leap year ", year);
        }

    }
}
