package oop.practice.classes.travelvouchers;

public enum TourType {
    EXCURSION,
    CRUISE,
    SHOPPING,
    RECREATION,
    TREATMENT;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
