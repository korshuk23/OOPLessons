package oop.practice.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first value: ");
            int firstValue = scanner.nextInt();

            System.out.println("Enter second value: ");
            int secondValue = scanner.nextInt();

            int result = firstValue / secondValue;
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        } catch (InputMismatchException e) {
            System.out.println("Expected int value!");
        }
    }
}
