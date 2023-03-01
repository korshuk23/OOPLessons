package oop.practice.exception;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> userNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Exit")) {
                break;
            }
            try {
                int parsedString = Integer.parseInt(line);
                userNumbers.add(parsedString);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                count++;
            }
        }
        int sum = 0;
        for (Integer number : userNumbers) {
            sum += number;
        }
        System.out.println("sum = " + sum);
        System.out.println("count not converted = " + count);
    }
}
