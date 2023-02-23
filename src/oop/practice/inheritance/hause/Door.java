package oop.practice.inheritance.hause;

public class Door {
    private boolean isOpen;
    private int countOfDoors;


    public Door() {
        this.isOpen = false;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void lock() {
        isOpen = false;
    }

    public void unlock() {
        isOpen = true;
    }
}
