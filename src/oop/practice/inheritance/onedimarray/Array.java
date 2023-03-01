package oop.practice.inheritance.onedimarray;

public class Array {
    private final Element[] elements;

    public Array(int size) {
        this.elements = new Element[size];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = new Element(0);
        }
    }

    public Array(int[] values) {
        this.elements = new Element[values.length];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = new Element(values[i]);
        }
    }

    public Element get(int index) {
        return elements[index];
    }

    public void set(int index, int value) {
        elements[index].setValue(value);
    }

    public int size() {
        return elements.length;
    }

    public void print() {
        for (Element element : elements) {
            System.out.println(element.getValue() + " ");
        }
        System.out.println();
    }
}
