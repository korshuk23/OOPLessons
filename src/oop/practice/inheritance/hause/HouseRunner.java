package oop.practice.inheritance.hause;

public class HouseRunner {
    public static void main(String[] args) {
        House house = new House(4, 2);
        house.printNumWindowsAndDoors();
        house.lockDoor(0);
    }
}
