package oop.practice.inheritance.simplefraction;

public class SimpleFraction extends Number {
    private final String fraction;

    public SimpleFraction(int numerator, int denominator) {
        super(numerator, denominator);
        if (denominator == 0) {
            throw new IllegalArgumentException("Division by ZERO");
        } else {
            this.fraction = numerator + "/" + denominator;
        }
    }

    public void printFraction() {
        System.out.println(fraction);
    }

    public SimpleFraction addition(SimpleFraction otherFraction) {
        int numerator = this.getNumerator() * otherFraction.getDenominator()
                + this.getDenominator() * otherFraction.getNumerator();
        int denominator = findLCM(this.getDenominator(), otherFraction.getDenominator());
        return new SimpleFraction(numerator, denominator);
    }

    public SimpleFraction subtraction(SimpleFraction otherFraction) {
        int numerator = this.getNumerator() * otherFraction.getDenominator()
                - this.getDenominator() * otherFraction.getNumerator();
        int denominator = findLCM(this.getDenominator(), otherFraction.getDenominator());
        return new SimpleFraction(numerator, denominator);
    }

    public SimpleFraction multiplication(SimpleFraction otherFraction) {
        return new SimpleFraction((this.getNumerator() * otherFraction.getNumerator()),
                (this.getDenominator() * otherFraction.getDenominator()));
    }

    public SimpleFraction division(SimpleFraction otherFraction) {
        return new SimpleFraction((this.getNumerator() * otherFraction.getDenominator()),
                (this.getDenominator() * otherFraction.getNumerator()));
    }
}
