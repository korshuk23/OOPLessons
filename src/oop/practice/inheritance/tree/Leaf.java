package oop.practice.inheritance.tree;

public class Leaf {
    private String color;

    public Leaf(String color) {
        this.color = color;
    }

    public void turnYellow() {
        System.out.println("The leaves have turned yellow.");
    }

    public void dropLeaves() {
        System.out.println("The leaves have fallen.");
    }
}
