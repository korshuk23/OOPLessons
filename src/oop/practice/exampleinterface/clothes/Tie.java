package oop.practice.exampleinterface.clothes;

public class Tie extends Clothing implements MenClothing {
    Tie(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужчина одел галстук " + size + ", цвет " + color + ", стоимость " + cost);
    }
}
