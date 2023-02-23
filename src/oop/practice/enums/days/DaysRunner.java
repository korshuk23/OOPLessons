package oop.practice.enums.days;

import java.util.Scanner;

public class DaysRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String days = "";
        if (scanner.hasNextLine()) {
            days = scanner.next();
        }
        DayType type = DayType.valueOf(days.toUpperCase());

        switch (type) {
            case MONDAY -> System.out.println(DayType.TUESDAY);
            case TUESDAY -> System.out.println(DayType.WEDNESDAY);
            case WEDNESDAY -> System.out.println(DayType.THURSDAY);
            case THURSDAY -> System.out.println(DayType.FRIDAY);
            case FRIDAY -> System.out.println(DayType.SATURDAY);
            case SATURDAY -> System.out.println(DayType.SUNDAY);
            case SUNDAY -> System.out.println(DayType.MONDAY);
        }
    }
}
