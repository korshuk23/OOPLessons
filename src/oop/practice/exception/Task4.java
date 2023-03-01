package oop.practice.exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        try {
            System.out.println("Enter array dimension: ");
            int n = scanner.nextInt();
            int[] array = new int[n];

            int sum = 0;
            for (int i : array) {
                i = random.nextInt(3);
                sum += i;
            }
            array[4] = 4;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds");
        } catch (InputMismatchException e) {
            System.out.println("Expected int value");
        }
    }
}
