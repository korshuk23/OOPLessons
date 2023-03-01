package oop.practice.enums.season;

public enum SeasonType {
    WINTER,
    SPRING,
    SUMMER,
    FALL;

    public static SeasonType getByMonth(int month) {
        return switch (month) {
            case 12, 1, 2 -> WINTER;
            case 3, 4, 5 -> SPRING;
            case 6, 7, 8 -> SUMMER;
            case 9, 10, 11 -> FALL;
            default -> throw new IllegalArgumentException("Invalid month number!");
        };
    }
}
