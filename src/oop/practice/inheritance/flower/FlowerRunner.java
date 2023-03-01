package oop.practice.inheritance.flower;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower = new Flower("Red", "Rose");
        flower.getDescription();
        flower.bloom();
        flower.wilt();
    }
}
