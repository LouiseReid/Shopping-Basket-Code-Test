package com.example.louisereid.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 25/11/2017.
 */

public class CustomerTest {

    Customer customer;
    Item bread;
    Item cereal;

    @Before
    public void before(){
        customer = new Customer(1, true);
        bread = new Item("Hovis", 200, false);
        cereal = new Item("Lucky Charms", 2200, false);

    }

    @Test
    public void canUseLoyalty(){
        customer.addToBasket(bread);
        customer.addToBasket(bread);
        assertEquals(392, customer.loyaltyDiscount());
    }

    @Test
    public void getsAllDiscounts(){
        customer.addToBasket(bread);
        customer.addToBasket(bread);
        customer.addToBasket(cereal);
        assertEquals(2332, customer.loyaltyDiscount());
    }
}
