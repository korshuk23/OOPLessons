package oop.practice.classes.car;

public class Wheel {
    private int radius;
    private WheelType wheelType;
    private RimsType rimsType;
    private WheelPosition position;
    public Wheel(int radius, WheelType wheelType, RimsType rimsType, WheelPosition position) {
        this.radius = radius;
        this.wheelType = wheelType;
        this.rimsType = rimsType;
        this.position = position;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public WheelType getWheelType() {
        return wheelType;
    }

    public void setWheelType(WheelType wheelType) {
        this.wheelType = wheelType;
    }

    public RimsType getRimsType() {
        return rimsType;
    }

    public void setRimsType(RimsType rimsType) {
        this.rimsType = rimsType;
    }

    public WheelPosition getPosition() {
        return position;
    }

    public void setPosition(WheelPosition position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return " radius: " + radius +
                ", wheelType: " + wheelType +
                ", rimsType: " + rimsType;
    }
}
