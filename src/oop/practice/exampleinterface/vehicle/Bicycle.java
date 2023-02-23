package oop.practice.exampleinterface.vehicle;

public class Bicycle implements Vehicle {
    private String model;
    private int wheels;

    public Bicycle(String model, int wheels) {
        this.model = model;
        this.wheels = wheels;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumWheels() {
        return wheels;
    }

    @Override
    public void startEngine() {
        System.out.println("The bicycle " + getModel() + " with number of wheels " + getNumWheels() + " don't have an engine.");
    }
}
