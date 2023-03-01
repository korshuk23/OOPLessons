package oop.practice.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        try {
            ArrayList<String> names = sortNamesFromFile();
            System.out.println(names);
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<String> sortNamesFromFile() throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<>();
        File file = new File("D:\\test\\test2.txt");
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            if (fileScanner.nextLine().isEmpty()) {
                throw new NullPointerException("File has empty lines");
            }
            names.add(fileScanner.nextLine());
        }

        Collections.sort(names);
        return names;
    }

}
