package oop.practice.inheritance.puppy;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("The dog " + getName() + " is barking.");
    }

    public void bite() {
        System.out.println("The dog " + getName() + " is biting.");
    }
}
