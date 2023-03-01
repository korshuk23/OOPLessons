package oop.practice.exception;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double value = Double.parseDouble(scanner.next());
            System.out.println("Value " + value + " is parsed.");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Error in parsing string! " + e.getMessage());
        }
    }
}
