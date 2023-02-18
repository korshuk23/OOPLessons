package oop.practice.clases.travelvouchers;

public enum FoodType {
    NOT_ALL_INCLUSIVE,
    BREAKFAST,
    LUNCH,
    DINNER,
    ALL_INCLUSIVE;


    @Override
    public String toString() {
        return super.toString().replace('_', ' ').toLowerCase();
    }
}
