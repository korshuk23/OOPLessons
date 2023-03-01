package oop.practice.exception;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value ");
        String firstNumber = scanner.nextLine();
        System.out.println("Enter second value ");
        String secondNumber = scanner.nextLine();
        System.out.print("Введите операцию (+, -, *, /, %): ");
        String operation = scanner.nextLine();

        try {
            int num1 = Integer.parseInt(firstNumber);
            int num2 = Integer.parseInt(secondNumber);

            switch (operation) {
                case "+" -> System.out.println("res = " + (num1 + num2));
                case "-" -> System.out.println("res = " + (num1 - num2));
                case "*" -> System.out.println("res = " + (num1 * num2));
                case "/" -> System.out.println("res = " + (num1 / num2));
                case "%" -> System.out.println("res = " + (num1 % num2));
                default -> throw new IllegalArgumentException("Error operation");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error. Not correct data");
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
