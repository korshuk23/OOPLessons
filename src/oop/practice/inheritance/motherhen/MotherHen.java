package oop.practice.inheritance.motherhen;

public class MotherHen extends Sparrow {
    public MotherHen(String name) {
        super(name);
    }

    public void carryEggs() {
        System.out.println("The mother hen " + getName() + " has carry eggs.");
    }

    public void hatchChicks() {
        System.out.println("The mother hen " + getName() + " has hatch chicks.");
    }
}
