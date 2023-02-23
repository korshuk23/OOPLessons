package oop.practice.inheritance.onedimarray;

public class ArrayRunner {
    public static void main(String[] args) {
        OneDimArray firstArray = new OneDimArray(new int[]{1, 2, 3, 4});
        OneDimArray secondArray = new OneDimArray(new int[]{3, 4, 5, 6});

        OneDimArray add = firstArray.add(secondArray);
        add.print();

        OneDimArray subtract = firstArray.subtract(secondArray);
        subtract.print();

        OneDimArray multiply = firstArray.multiply(secondArray);
        multiply.print();
    }
}
