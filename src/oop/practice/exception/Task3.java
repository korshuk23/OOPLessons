package oop.practice.exception;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your text: ");
            int intFromString = Integer.parseInt(scanner.next());
            System.out.println(intFromString);
        } catch (NumberFormatException e) {
            System.out.println("Number format error!");
        }
    }
}
