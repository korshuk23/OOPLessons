package oop.practice.enums.planets;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a planet: ");
        String planetName = "";
        
        if (scanner.hasNextLine()) {
            planetName = scanner.nextLine().toUpperCase();
        }
        PlanetType planetType;

        try {
            planetType = PlanetType.valueOf(planetName);
        } catch (IllegalArgumentException e) {
            System.out.println("There is no such planet");
            return;
        }

        double distanceFromSun = planetType.getDistanceFromSun();
        System.out.printf("%s is %.2f astronomical units from the Sun.\n", planetName, distanceFromSun);
    }
}
