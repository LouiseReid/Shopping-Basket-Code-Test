package com.example.louisereid.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by louisereid on 25/11/2017.
 */

public class Customer {

    private int id;
    private boolean loyaltyCard;
    private Basket basket;

    public Customer(int id, boolean loyaltyCard) {
        this.id = id;
        this.loyaltyCard = loyaltyCard;
        basket = new Basket();
    }

    public int getId() {
        return id;
    }

    public boolean isLoyaltyCard() {
        return loyaltyCard;
    }

    public Basket getBasket() {
        return basket;
    }

    public void addToBasket(Item item){
        basket.addToBasket(item);
    }


    public int loyaltyDiscount(){
        int total = 0;
        if(loyaltyCard){
            total = basket.total();
        }
        return total *= 0.98;
    }
}
