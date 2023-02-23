package oop.practice.inheritance.shape;

import java.awt.*;

public abstract class Shape {
    private Color color;
    private double volume;

    public Shape() {
        this(new Color(0, 0, 0), 0.0);
    }

    public Shape(Color color, double volume) {
        this.color = color;
        this.volume = volume;
    }

    public abstract void draw();

    public double getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
