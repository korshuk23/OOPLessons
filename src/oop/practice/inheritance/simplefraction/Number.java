package oop.practice.inheritance.simplefraction;

public class Number {
    private int numerator;
    private int denominator;

    public Number(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public int findLCM(int a, int b) {
        int gcd = findGCD(a, b);
        return (a * b) / gcd;
    }
}
