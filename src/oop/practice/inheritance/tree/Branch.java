package oop.practice.inheritance.tree;

public class Branch extends Leaf {

    public Branch(String color) {
        super(color);
    }

    public void bloom() {
        System.out.println("The branch is blossomed");
    }

    public void frost() {
        System.out.println("The branch was covered with frost");
    }
}
