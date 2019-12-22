package Ht3Reverce;

import java.util.Scanner;

public class Reverce {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter yor data ");
        String datas = data.nextLine();
        char [] charString = datas.toCharArray();
        for (int i = charString.length-1; i>=0; i--) {
            System.out.print(charString[i]);
        }
    }
}