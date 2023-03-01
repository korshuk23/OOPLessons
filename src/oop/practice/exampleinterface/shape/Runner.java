package oop.practice.exampleinterface.shape;

public class Runner {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Circle(5),
                new Rectangle(10, 20),
                new Triangle(3, 4, 5)};

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            shape.draw();
            System.out.println();
        }
    }
}
