package oop.practice.inheritance.simplefraction;

public class FractionRunner {
    public static void main(String[] args) {
        SimpleFraction firstFraction = new SimpleFraction(2,3);
        SimpleFraction secondFraction = new SimpleFraction(3,5);

        SimpleFraction addition = firstFraction.addition(secondFraction);
        addition.printFraction();

        SimpleFraction subtraction = firstFraction.subtraction(secondFraction);
        subtraction.printFraction();

        SimpleFraction multiplication = firstFraction.multiplication(secondFraction);
        multiplication.printFraction();

        SimpleFraction division = firstFraction.division(secondFraction);
        division.printFraction();



    }
}
