package oop.practice.inheritance.tree;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Tree("Yellow");
        tree.bloom();
        tree.dropLeaves();
        tree.frost();
        tree.turnYellow();
    }
}
