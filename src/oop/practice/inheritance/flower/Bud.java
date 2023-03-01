package oop.practice.inheritance.flower;

public class Bud extends Petal {

    private static final int PETALS_COUNT = 55;

    public Bud(String color) {
        super(color);
    }

    public int getPetalsCount() {
        return PETALS_COUNT;
    }
}
