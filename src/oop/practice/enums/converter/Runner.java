package oop.practice.enums.converter;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter currency type - USD, EUR, GBP, JPY: ");
        String currencyCode = "";
        if (scanner.hasNextLine()) {
            currencyCode = scanner.nextLine().toUpperCase();
        }

        CurrencyType currency;
        try {
            currency = CurrencyType.valueOf(currencyCode);
        } catch (IllegalArgumentException e) {
            System.out.println("There is no such currency!");
            return;
        }

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double usdAmount = amount / currency.getRate();

        System.out.printf("%.2f %s = %.2f USD\n", amount, currencyCode, usdAmount);
    }
}
