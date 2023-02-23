package oop.practice.classes.car;

public class Engine {
    private int horsePower;
    private double volume;
    private boolean hasEngine;

    public Engine(int horsePower, double volume) {
        this.horsePower = horsePower;
        this.volume = volume;
        this.hasEngine = true;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean hasEngine() {
        return hasEngine;
    }

    public void setEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    @Override
    public String toString() {
        return " horsePower: " + horsePower +
                ", volume:" + volume;
    }
}
