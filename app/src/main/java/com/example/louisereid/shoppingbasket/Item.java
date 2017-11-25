package com.example.louisereid.shoppingbasket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by louisereid on 25/11/2017.
 */

public class Item {

    private String name;
    private int price;
    private boolean bogof;
    private int qty;

    public Item(String name, int price, boolean bogof) {
        this.name = name;
        this.price = price;
        this.bogof = bogof;
        qty = 0;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBogof() {
        return bogof;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int discount10(){
        if(price > 2000){
           setPrice(price *= 0.90);
        }
        return price;
    }

}
