package Ht5Dish;

import java.security.PublicKey;

public class Dish {
    String dish;
    double calory;
    static double caloryCounter=0;

    public Dish(String dish, double calory) {
        this.dish = dish;
        this.calory = calory;
        caloryCounter += calory;
    }
}
