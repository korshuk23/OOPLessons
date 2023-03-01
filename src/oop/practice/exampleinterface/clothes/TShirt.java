package oop.practice.exampleinterface.clothes;

public class TShirt extends Clothing implements MenClothing, WomenClothing {
    TShirt(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужчина одел футболку " + size + ", цвет " + color + ", стоимость " + cost);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одела футболку " + size + ", цвет " + color + ", стоимость " + cost);
    }
}
