package oop.practice.clases.person;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }
    public void move() {
        System.out.println(fullName + " are move.");
    }

    public void talk() {
        System.out.println(fullName + " is talk.");
    }
}
