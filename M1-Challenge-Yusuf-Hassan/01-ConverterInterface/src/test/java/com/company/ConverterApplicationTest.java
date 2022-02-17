package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterApplicationTest {

    ConverterIf converterIf;
    ConverterSwitch converterSwitch;

    @Before
    public void setUp() {
        converterIf = new ConverterIf();
        converterSwitch = new ConverterSwitch();
    }

    @Test
    public void shouldReturnCorrespondingMonth() {
        assertEquals("January", converterIf.convertMonth(1));
        assertEquals("February", converterIf.convertMonth(2));
        assertEquals("March", converterIf.convertMonth(3));
        assertEquals("April", converterIf.convertMonth(4));
        assertEquals("May", converterIf.convertMonth(5));
        assertEquals("June", converterIf.convertMonth(6));
        assertEquals("July", converterIf.convertMonth(7));
        assertEquals("August", converterIf.convertMonth(8));
        assertEquals("September", converterIf.convertMonth(9));
        assertEquals("October", converterIf.convertMonth(10));
        assertEquals("November", converterIf.convertMonth(11));
        assertEquals("December", converterIf.convertMonth(12));


    }

    @Test
    public void shouldReturnCorrespondingDay() {
        assertEquals("Sunday", converterSwitch.convertDay(1));
        assertEquals("Monday", converterSwitch.convertDay(2));
        assertEquals("Tuesday", converterSwitch.convertDay(3));
        assertEquals("Wednesday", converterSwitch.convertDay(4));
        assertEquals("Thursday", converterSwitch.convertDay(5));
        assertEquals("Friday", converterSwitch.convertDay(6));
        assertEquals("Saturday", converterSwitch.convertDay(7));
    }

}