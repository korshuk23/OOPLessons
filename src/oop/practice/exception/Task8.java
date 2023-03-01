package oop.practice.exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task8 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> lines = fillList();
        arrayOperations(lines);

    }

    public static void arrayOperations(ArrayList<String> lines) {
        while (true) {
            try {
                System.out.println("Choose your operation");
                String operation = scanner.nextLine();
                switch (operation) {
                    case "change" -> {
                        int index = indexReader("Enter index of line to change: ", lines);
                        System.out.println("Enter new line: ");
                        String newLine = scanner.nextLine();
                        lines.set(index - 1, newLine);
                        System.out.println("Result of changing: " + lines);
                    }
                    case "delete" -> {
                        int index = indexReader("Enter index of line to delete: ", lines);
                        lines.remove(index - 1);
                        System.out.println("Result of deleting: " + lines);
                    }
                    case "add" -> {
                        System.out.println("Enter new line to add: ");
                        String newLine = scanner.nextLine();
                        lines.add(newLine);
                        System.out.println("Result of adding: " + lines);

                    }
                    case "exit" -> {
                        System.out.println("Program is closed");
                        return;
                    }
                    default -> {
                        throw new InputMismatchException("Incorrect operation!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error! " + e.getMessage());
            }
        }
    }

    public static int indexReader(String prompt, ArrayList<String> lines) {
        System.out.println(prompt);
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < 1 || index > lines.size()) {
            throw new IndexOutOfBoundsException("Incorrect string number!");
        }
        return index;
    }

    public static ArrayList<String> fillList() {
        ArrayList<String> lines = new ArrayList<>();
        int countOfLines = 0;
        try {
            System.out.println("Enter count of lines: ");
            countOfLines = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Error, there is not an integer entered!");
        }
        for (int i = 0; i < countOfLines; i++) {
            System.out.printf("Enter string number %d: ", i + 1);
            String str = scanner.nextLine();
            lines.add(str);
        }
        return lines;
    }
}