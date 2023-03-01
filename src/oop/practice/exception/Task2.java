package oop.practice.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter file name");
            String fileName = scanner.nextLine();

            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
