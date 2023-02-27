package oop.practice.exampleinterface.clothes;

public class Runner {
    public static void main(String[] args) {
        Clothing[] clothes = new Clothing[] {
                new TShirt(ClothesSize.M, 1500, "Синяя"),
                new Pants(ClothesSize.L, 2500, "Черные"),
                new Skirt(ClothesSize.L.S, 2000, "Красная"),
                new Tie(ClothesSize.S, 1000, "Зеленый")
        };

        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        atelier.dressWoman(clothes);
    }
}
