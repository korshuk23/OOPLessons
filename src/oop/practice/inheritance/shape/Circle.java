package oop.practice.inheritance.shape;

import java.awt.*;

public class Circle extends Shape {
    private int coordinateX;
    private int coordinateY;

    public Circle() {
        super();
    }

    public Circle(int coordinateX, int coordinateY) {
        super();
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Circle(Color color, double volume, int coordinateX, int coordinateY) {
        super(color, volume);
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "color: " + getColor() +
                ", x: " + coordinateX +
                ", y: " + coordinateY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (coordinateX != circle.coordinateX) return false;
        return coordinateY == circle.coordinateY;
    }

    @Override
    public int hashCode() {
        int result = coordinateX;
        result = 31 * result + coordinateY;
        return result;
    }
}
