package Ht5Dish;

import java.security.PublicKey;
import java.util.Scanner;

public class CaloryCounter {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter dish amount: ");
        int dishAmount = a.nextInt();
        for (int i = 0; i<dishAmount; i++){
            createDish();
        }
        System.out.println(Dish.caloryCounter);
    }

    public static void createDish (){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter dish name: ");
        String dishName = a.nextLine();
        Scanner b = new Scanner(System.in);
        System.out.println("Enter dish calory: ");
        int dishCalory = a.nextInt();
        Dish dish=new Dish(dishName, dishCalory);
    }
}
