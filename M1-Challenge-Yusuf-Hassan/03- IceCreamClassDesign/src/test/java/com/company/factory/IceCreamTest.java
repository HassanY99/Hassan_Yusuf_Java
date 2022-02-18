package com.company.factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    IceCream iceCream;

    @Before
    public void setUp() throws Exception {
        iceCream = new IceCream("Chocolate", 6.0, 1.99, 45.0, "Milk and Chocolate");

    }

    @Test
    public void getIceCream() {
        assertEquals("Chocolate", iceCream.getFlavor());
        assertEquals(6.0, iceCream.getSaleOfPrice(), 0.01);
        assertEquals(1.99, iceCream.getProductionCost(), 0.01);
        assertEquals(45.0, iceCream.getProductionTime(), 0.01);
        assertEquals("Milk and Chocolate", iceCream.getIngredients());

    }

    @Test
    public void iceCreamProfit() {
        assertEquals(4.01, iceCream.profit(iceCream.getSaleOfPrice(), iceCream.getProductionCost()), 0.01);

    }

    @Test
    public void shouldGetTheMostPopularFlavor() {
        assertEquals(true, iceCream.mostPopularFlavor("Chocolate"));
        assertEquals(true, iceCream.mostPopularFlavor("Mango"));
        assertEquals(false, iceCream.mostPopularFlavor("Strawberry"));
        assertEquals(false, iceCream.mostPopularFlavor("Peach"));
    }
}