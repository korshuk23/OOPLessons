package oop.practice.exception;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        try {
            int age = scanner.nextInt();
            if (age < 18) {
                throw new IllegalArgumentException("You are very young");
            } else if (age > 100) {
                throw new IllegalArgumentException("You are very old");
            }
            System.out.println("Your age is " + age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
