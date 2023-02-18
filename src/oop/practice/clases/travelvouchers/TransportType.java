package oop.practice.clases.travelvouchers;

public enum TransportType {
    CAR,
    BUS,
    TRAIN,
    PLANE,
    SHIP;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
