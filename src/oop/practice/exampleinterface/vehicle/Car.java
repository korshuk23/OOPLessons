package oop.practice.exampleinterface.vehicle;

public class Car implements Vehicle {
    private String model;
    private int wheels;

    public Car(String model, int wheels) {
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
        System.out.println("The car " + getModel() + " with number of wheels " + getNumWheels() + " is start engine.");
    }
}
