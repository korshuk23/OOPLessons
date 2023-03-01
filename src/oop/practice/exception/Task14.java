package oop.practice.exception;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        try {
            System.out.print("Введите URL-адрес: ");
            Scanner scanner = new Scanner(System.in);
            String urlString = scanner.nextLine();
            URL url = new URL(urlString);
            System.out.println("URL-адрес действителен.");
        } catch (MalformedURLException e) {
            System.out.println("URL-адрес недействителен.");
        }

    }
}
