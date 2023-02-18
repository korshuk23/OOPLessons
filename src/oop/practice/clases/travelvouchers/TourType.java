package oop.practice.clases.travelvouchers;

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
