package oop.practice.exampleinterface.vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Bicycle("Aist", 2),
                new Car("BNW", 4),
                new Motorcycle("Minsk", 2)};

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}
