package com.company.pointofsale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    IceCream iceCream;

    @Before
    public void setUp() throws Exception {
        iceCream = new IceCream("Vanilla", 5.95, 30);
    }

    @Test
    public void shouldGetIceCream() {
        assertEquals("Vanilla", iceCream.getFlavor());
        assertEquals(5.95, iceCream.getPrice(), 0.01);
        assertEquals(30, iceCream.getQuantity());
    }

    @Test
    public void getTotalSalesOfFlavor() {
        assertEquals(178.5, iceCream.totalSalesForAFlavor(iceCream.getFlavor(), iceCream.getPrice(), iceCream.getQuantity()), 0.01);
    }

    @Test
    public void shouldGetAvailableIceCreamsThatAreInHighStock() {
        assertEquals(true, iceCream.inHighStock(50));
        assertEquals(true, iceCream.inHighStock(30));
        assertEquals(false, iceCream.inHighStock(10));
        assertEquals(false, iceCream.inHighStock(5));
    }
}