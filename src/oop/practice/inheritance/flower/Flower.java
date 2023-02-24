package oop.practice.inheritance.flower;

public class Flower extends Bud {
    private String name;
    private static final int countOfBuds = 5;

    public Flower(String color, String name) {
        super(color);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addColor(String color) {
        this.setColor(color);
    }

    public void getDescription() {
        System.out.println("The flower " + name + " color is " + this.getColor() + ". count of buds: "
                + countOfBuds + " count of petals: " + this.getPetalsCount());
    }
    public void bloom() {
        System.out.println("The flower is blooming.");
    }

    public void wilt() {
        System.out.println("The flower is wilting.");
    }


}
