package oop.practice.inheritance.hause;

public class Window {
    private boolean isOpen;
    private int countOfWindows;

    public Window() {
        this.isOpen = false;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getCountOfWindows() {
        return countOfWindows;
    }

    public void setCountOfWindows(int countOfWindows) {
        this.countOfWindows = countOfWindows;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open() {
        isOpen = false;
    }

    public void close() {
        isOpen = true;
    }
}
