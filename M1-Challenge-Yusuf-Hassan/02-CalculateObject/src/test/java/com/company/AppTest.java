package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void shouldAddIntsAndDouble() {
        assertEquals(2, calculator.add(1,1));
        assertEquals(5.699999999999999, calculator.add(3.4,2.3), 0.01);
    }

    @Test
    public void shouldSubtractIntsAndDouble() {
        assertEquals(-29, calculator.subtract(23,52));
        assertEquals(5.0, calculator.subtract(5.5,0.5), 0.01);
    }

    @Test
    public void shouldMultiplyIntsAndDouble() {
        assertEquals(68, calculator.multiply(34,2));
        assertEquals(29.48, calculator.multiply(6.7,4.4), 0.01);
    }

    @Test
    public void shouldDivideIntsAndDouble() {
        assertEquals(4, calculator.divide(12,3));
        assertEquals(4.90909091, calculator.divide(10.8,2.2), 0.01);
    }




}