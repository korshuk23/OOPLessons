package oop.practice.exampleinterface.instrument;

public class Guitar implements Instrument {
    int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public void play() {
        System.out.println("Играет гитара с " + numberOfStrings + " струнами");
    }
}
