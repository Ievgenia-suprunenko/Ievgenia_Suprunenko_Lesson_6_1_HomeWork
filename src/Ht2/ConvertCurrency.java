package Ht2;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter your currency (USD, EUR, UAH, JPY, GBP): ");
        String currency = a.nextLine();
        Scanner b = new Scanner(System.in);
        System.out.print("Enter your amount ");
        Double amount = b.nextDouble();
        Scanner c = new Scanner(System.in);
        System.out.print("Which currency you want to get? (USD, Euro, UAH, JPY, GBP): ");
        String currency2 = c.nextLine();

    }
}
