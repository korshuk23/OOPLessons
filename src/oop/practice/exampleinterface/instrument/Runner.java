package oop.practice.exampleinterface.instrument;

public class Runner {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[]{
                new Guitar(12),
                new Drums(24),
                new Trumpet(4)};

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
