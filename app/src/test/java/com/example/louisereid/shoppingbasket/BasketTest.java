package com.example.louisereid.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 25/11/2017.
 */

public class BasketTest {

    Basket basket;
    Item bread;
    Item milk;
    Item cereal;

    @Before
    public void before(){
        basket = new Basket();
        bread = new Item("Hovis", 200, true);
        milk = new Item("Green", 150, false);
        cereal = new Item("Lucky Charms", 2200, false);

    }

    @Test
    public void basketStartsEmpty(){
        assertEquals(true, basket.basketIsEmpty());
    }

    @Test
    public void canAddToBasket(){
        basket.addToBasket(bread);
        basket.addToBasket(bread);
        basket.addToBasket(bread);
        assertEquals(3, basket.basketSize());
        assertEquals(3, bread.getQty());
    }

    @Test
    public void canRemoveFromBasket(){
        basket.addToBasket(bread);
        basket.addToBasket(milk);
        basket.removeFromBasket(bread);
        assertEquals(1, basket.basketSize());
    }

    @Test
    public void canEmptyBasket(){
        basket.addToBasket(bread);
        basket.addToBasket(milk);
        basket.empty();
        assertEquals(0, basket.basketSize());
    }

    @Test
    public void basketHasTotal(){
        basket.addToBasket(bread);
        basket.addToBasket(milk);
        basket.addToBasket(cereal);
        assertEquals(2330, basket.total());
    }

    @Test
    public void canBogof(){
        basket.addToBasket(bread);
        basket.addToBasket(bread);
        basket.addToBasket(bread);
        basket.addToBasket(milk);
        assertEquals(550, basket.bogof());
    }



}
