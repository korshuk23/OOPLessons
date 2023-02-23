package oop.practice.classes;

import java.util.Scanner;

public class Reader {
    private static final Scanner scanner= new Scanner(System.in);

    public static int readIntValue(String prompt) {
        System.out.print(prompt + " ");
        int counter = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("Error, expected Int value. Try again: ");
            scanner.next();
            if (counter++ > 5) {
                System.exit(1);
            }
        }
        return scanner.nextInt();
    }

    public static String readString(String prompt) {
        System.out.print(prompt + " ");
        int counter = 0;
        while (!scanner.hasNextLine()) {
            counter++;
            scanner.next();
            if (counter++ > 5) {
                System.exit(1);
            }
        }
        return scanner.next();
    }
}
