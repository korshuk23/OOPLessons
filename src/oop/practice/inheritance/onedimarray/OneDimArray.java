package oop.practice.inheritance.onedimarray;

public class OneDimArray extends Array {
    public OneDimArray(int size) {
        super(size);
    }

    public OneDimArray(int[] values) {
        super(values);
    }

    public OneDimArray add(OneDimArray other) {
        if (size() != other.size()) {
            throw new IllegalArgumentException("Arrays must have the same size");
        }
        OneDimArray result = new OneDimArray(size());
        for (int i = 0; i < size(); i++) {
            int sum = get(i).getValue() + other.get(i).getValue();
            result.set(i, sum);
        }
        return result;
    }

    public OneDimArray subtract(OneDimArray other) {
        if (size() != other.size()) {
            throw new IllegalArgumentException("Arrays must have the same size");
        }
        OneDimArray result = new OneDimArray(size());
        for (int i = 0; i < size(); i++) {
            int diff = get(i).getValue() - other.get(i).getValue();
            result.set(i, diff);
        }
        return result;
    }

    public OneDimArray multiply(OneDimArray other) {
        if (size() != other.size()) {
            throw new IllegalArgumentException("Arrays must have the same size");
        }
        OneDimArray result = new OneDimArray(size());
        for (int i = 0; i < size(); i++) {
            int product = get(i).getValue() * other.get(i).getValue();
            result.set(i, product);
        }
        return result;
    }
}
