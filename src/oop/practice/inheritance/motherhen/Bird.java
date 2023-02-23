package oop.practice.inheritance.motherhen;

public class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sing(){
        System.out.println("The bird is singing");
    }
}
