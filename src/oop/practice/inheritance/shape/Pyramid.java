package oop.practice.inheritance.shape;

import java.awt.*;
import java.util.Objects;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid() {
        super();
    }

    public Pyramid(double s, double h) {
        super();
        this.s = s;
        this.h = h;
    }

    public Pyramid(Color color, double volume, double s, double h) {
        super(color, volume);
        this.s = s;
        this.h = h;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "s: " + s +
                ", h: " + h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pyramid pyramid = (Pyramid) o;

        if (s != pyramid.s) return false;
        return s == pyramid.s;
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, h);
    }
}
