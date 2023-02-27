package oop.practice.exampleinterface.clothes;

public class Skirt extends Clothing implements WomenClothing {
    Skirt(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одела юбку " + size + ", цвет " + color + ", стоимость " + cost);
    }
}
