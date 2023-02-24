package oop.practice.enums.converter;

public enum CurrencyType {
    USD(1),
    EUR(0.95),
    GBP(0.84),
    JPY(136.41);
    private final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
