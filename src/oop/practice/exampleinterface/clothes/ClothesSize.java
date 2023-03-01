package oop.practice.exampleinterface.clothes;

public enum ClothesSize {
    XXS(32) {
        @Override
        String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    ClothesSize(int euroSize) {
        this.euroSize = euroSize;
    }

    int getEuroSize() {
        return euroSize;
    }

    String getDescription() {
        return "Взрослый размер";
    }

    @Override
    public String toString() {
        return name() + " (EU " + euroSize + ")";
    }
}
