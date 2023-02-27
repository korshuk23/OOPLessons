package oop.practice.exampleinterface.instrument;

public class Drums implements Instrument {
    int size;

    public Drums(int size) {
        this.size = size;
    }

    public void play() {
        System.out.println("Играет барабан с размером " + size);
    }
}
