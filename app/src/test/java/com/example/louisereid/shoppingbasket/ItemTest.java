package com.example.louisereid.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 25/11/2017.
 */

public class ItemTest {

    Item bread;
    Item milk;
    Item cereal;

    @Before
    public void before(){
        bread = new Item("Hovis", 200, true);
        milk = new Item("Green", 150, false);
        cereal = new Item("Lucky Charms", 2200, false);

    }

    @Test
    public void isBogof(){
        assertEquals(true, bread.isBogof());
        assertEquals(false, milk.isBogof());
    }

    @Test
    public void hasPrice(){
        assertEquals(200, bread.getPrice());
        assertEquals(150, milk.getPrice());
    }

    @Test
    public void canDiscount10(){
        cereal.discount10();
        assertEquals(1980, cereal.getPrice());
    }




}
