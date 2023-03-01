package oop.practice.enums.calculator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = 0;
        if (scanner.hasNextDouble()) {
            number1 = scanner.nextDouble();
        }
        double number2 = 0;
        if (scanner.hasNextDouble()) {
            System.out.print("Enter the second number: ");
            number2 = scanner.nextDouble();
        }
        System.out.println("Choose an arithmetic operation:");
        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
        System.out.println("Division");

        String choice = scanner.next();
        OperationType operation = OperationType.valueOf(choice.toUpperCase());

        double result;

        switch (operation) {
            case ADDITION -> result = number1 + number2;
            case SUBTRACTION -> result = number1 - number2;
            case MULTIPLICATION -> result = number1 * number2;
            case DIVISION -> result = number1 / number2;
            default -> {
                System.out.println("Invalid operation!");
                return;
            }
        }

        System.out.println("Result: " + result);
    }
}
