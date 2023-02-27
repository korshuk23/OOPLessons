package oop.practice.exampleinterface.clothes;

public abstract class Clothing {
    ClothesSize size;
    double cost;
    String color;

    Clothing(ClothesSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
