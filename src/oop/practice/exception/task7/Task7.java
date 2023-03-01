package oop.practice.exception.task7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = intReader("Enter array dimension: ");

        int[] array = fillArray(n);

        int sum = intReader("Enter sum to compare: ");
        try {
            findPairs(array, sum);
        } catch (NoPairsFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] fillArray(int n) {
        int[] array = new int[n];
        System.out.println("Fill array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int intReader(String prompt) {
        System.out.println(prompt);
        int value = 0;
        try {
            value = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return value;
    }

    private static void findPairs(int[] array, int sum) throws NoPairsFoundException {
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println(array[i] + " + " + array[j] + " = " + sum);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            throw new NoPairsFoundException("Not founded");
        }
    }
}
