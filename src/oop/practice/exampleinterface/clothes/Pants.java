package oop.practice.exampleinterface.clothes;

public class Pants extends Clothing implements MenClothing, WomenClothing {
    Pants(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужчина одел штаны " + size + ", цвет " + color + ", стоимость " + cost);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одела штаны " + size + ", цвет " + color + ", стоимость " + cost);
    }
}
