package oop.practice.inheritance.puppy;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("The animal is making sound. ");
    }

    public void run() {
        System.out.println("The animal is running. ");
    }

    public void jump() {
        System.out.println("The animal is jumping. ");
    }
}
