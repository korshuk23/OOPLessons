package oop.practice.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("D:\\test\\test3.txt");
            Scanner fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
