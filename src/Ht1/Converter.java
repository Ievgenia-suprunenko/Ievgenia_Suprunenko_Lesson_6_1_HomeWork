package Ht1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner USD = new Scanner(System.in);
        System.out.println("Enter yor summ in $");
        double usd = USD.nextDouble();
        double rate = 1.1;
        System.out.println("Currently exchange rate is " + rate);
        System.out.print("You'll have " );
        System.out.print(convertUsdToEuro(usd,rate));
        System.out.print(" Euro" );
    }
    public static double convertUsdToEuro (double usd, double rate){
        return usd / rate;
    }
}
