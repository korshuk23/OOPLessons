package oop.practice.exampleinterface.clothes;

public class Atelier {
    public void dressMan(Clothing[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothing c : clothes) {
            if (c instanceof MenClothing) {
                System.out.println(c);
            }
        }
    }

    public void dressWoman(Clothing[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothing c : clothes) {
            if (c instanceof WomenClothing) {
                System.out.println(c);
            }
        }
    }
}
