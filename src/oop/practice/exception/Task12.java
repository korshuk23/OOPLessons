package oop.practice.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String path = scanner.nextLine();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while (reader.readLine() != null) {
                System.out.println("File has been read");
            }
        } catch (NullPointerException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

