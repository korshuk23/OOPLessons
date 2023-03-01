package oop.practice.inheritance.motherhen;

public class Sparrow extends Bird {
    public Sparrow(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("The sparrow" + getName() + "is flying");
    }
}
