package com.example.louisereid.shoppingbasket;

import java.util.ArrayList;


/**
 * Created by louisereid on 25/11/2017.
 */

public class Basket {

    private ArrayList<Item> items;
    private int basketTotal;

    public Basket() {
        items = new ArrayList<>();
        basketTotal = 0;
    }

    public int getBasketTotal() {
        return basketTotal;
    }

    public void setBasketTotal(int basketTotal) {
        this.basketTotal = basketTotal;
    }

    public boolean basketIsEmpty(){
        return items.isEmpty();
    }

    public int basketSize(){
        return items.size();
    }

    public void addToBasket(Item item){
        int quantity = item.getQty();
        items.add(item);
        quantity ++;
        item.setQty(quantity);
    }

    public void removeFromBasket(Item item){
        items.remove(item);
    }

    public void empty(){
        items.clear();
    }

    public int bogof(){
        int total = 0;
        for(Item item : items){
            if(item.isBogof()){
                total += ((item.getQty()/2) * item.getPrice()) + ((item.getQty() % 2) * item.getPrice());
            }
            if(!item.isBogof()){
                total += item.getPrice();
            }
        }
        return total;
    }


    public int total(){
        for(Item item : items){
            item.discount10();
            bogof();
            basketTotal += item.getPrice();
        }
        return basketTotal;
    }




}
