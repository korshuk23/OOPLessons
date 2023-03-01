package oop.practice.exampleinterface.vehicle;

public class Motorcycle implements Vehicle {
    private String model;
    private int wheels;

    public Motorcycle(String model, int wheels) {
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
       System.out.println("The motorcycle " + getModel() + "with number of wheels " + getNumWheels() + " is started engine.");
   }
}
