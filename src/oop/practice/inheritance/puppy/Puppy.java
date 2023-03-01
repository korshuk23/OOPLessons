package oop.practice.inheritance.puppy;

public class Puppy extends Dog {
    public Puppy(String name) {
        super(name);
    }

    public void play() {
        System.out.println("Puppy name is " + getName());
    }
}
