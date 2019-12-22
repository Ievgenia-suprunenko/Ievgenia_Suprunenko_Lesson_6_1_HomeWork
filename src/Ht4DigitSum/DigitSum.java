package Ht4DigitSum;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        System.out.println("Enter your 3digit number");
        String numbers = numb.nextLine();
        int a = numbers.length();
        char[] charInt = numbers.toCharArray();
        int sum = 0;
        if (a != 3){
            System.out.println("You entered wrong data");
            return;
        }
        for (int i = 0; i <= 2; i++) {
            sum += Character.getNumericValue(charInt[i]);
        }
        System.out.println(sum);
    }
}
