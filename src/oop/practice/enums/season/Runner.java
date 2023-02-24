package oop.practice.enums.season;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = 0;
        if (scanner.hasNextInt()) {
            month = scanner.nextInt();
        }
        SeasonType season = SeasonType.getByMonth(month);
        System.out.printf("Month %d is in the %s\n", month, season);
    }
}
