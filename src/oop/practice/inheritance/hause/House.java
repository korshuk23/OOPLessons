package oop.practice.inheritance.hause;

import java.util.ArrayList;

public class House {
    private final ArrayList<Window> windows;
    private final ArrayList<Door> doors;

    public House(int numWindows, int numDoors) {
        this.windows = new ArrayList<>(numWindows);
        for (int i = 0; i < numWindows; i++) {
            this.windows.add(new Window());
        }

        this.doors = new ArrayList<>(numDoors);
        for (int i = 0; i < numDoors; i++) {
            this.doors.add(new Door());
        }
    }

    public void lockAllDoors() {
        for (Door door : doors) {
            door.lock();
        }
        System.out.println("All doors is locked");
    }

    public void lockDoor(int index) {
        if (index >= 0 && index < doors.size()) {
            doors.get(index).lock();
            System.out.println("The door is locked");
        }
    }

    public void printNumWindowsAndDoors() {
        System.out.println("Number of windows: " + windows.size());
        System.out.println("Number of doors: " + doors.size());
    }
}
