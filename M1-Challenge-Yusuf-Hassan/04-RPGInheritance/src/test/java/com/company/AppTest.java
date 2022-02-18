package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    LeadCharacter farmer;
    LeadCharacter constable;
    LeadCharacter warrior;

    @Before
    public void setUp() throws Exception {
        farmer = new Farmer();
        farmer.setName("Farmer");
        farmer.setStrength(75);
        farmer.setHealth(100);
        farmer.setStamina(75);
        farmer.setSpeed(10);
        farmer.setAttackPower(1);
        farmer.setRunning(false);
        farmer.setArrested(false);
        farmer.setPlowing(false);
        farmer.setHarvesting(false);
        farmer.setAbilities("Attack another character");

        constable = new Constable();
        constable.setName("Constable");
        constable.setStrength(60);
        constable.setHealth(100);
        constable.setStamina(60);
        constable.setSpeed(20);
        constable.setAttackPower(5);
        constable.setRunning(false);
        constable.setArrested(false);
        constable.setJurisdiction("Has the authority to make legal decisions");
        constable.setAbilities("Arrest another character" + "attack another character");

        warrior = new Warrior();
        warrior.setName("Warrior");
        warrior.setStrength(75);
        warrior.setHealth(100);
        warrior.setStamina(100);
        warrior.setSpeed(50);
        warrior.setAttackPower(10);
        warrior.setShieldStrength(100);
        warrior.setRunning(false);
        warrior.setArrested(false);
        warrior.setAbilities("Attack another character");
    }



    @Test
    public void shouldHaveAllFarmerPropertiesAndAbilities() {
        assertEquals("Farmer", farmer.getName());
        assertEquals(75, farmer.getStrength());
        assertEquals(100, farmer.getHealth());
        assertEquals(75, farmer.getStamina());
        assertEquals(10, farmer.getSpeed());
        assertEquals(1, farmer.getAttackPower());
        assertEquals(false, farmer.getRunning());
        assertEquals(false, farmer.getArrested());
        assertEquals(false, farmer.getPlowing());
        assertEquals(false, farmer.getHarvesting());
        assertEquals("Attack another character", farmer.getAbilities());
    }

    @Test
    public void shouldHaveAllConstablePropertiesAndAbilities() {
        assertEquals("Constable", constable.getName());
        assertEquals(60, constable.getStrength());
        assertEquals(100, constable.getHealth());
        assertEquals(60, constable.getStamina());
        assertEquals(20, constable.getSpeed());
        assertEquals(5, constable.getAttackPower());
        assertEquals(false, constable.getRunning());
        assertEquals(false, constable.getArrested());
        assertEquals("Has the authority to make legal decisions", constable.getJurisdiction());
        assertEquals("Arrest another character" + "attack another character", constable.getAbilities());

    }

    @Test
    public void shouldHaveAllWarriorPropertiesAndAbilities() {
        assertEquals("Warrior", warrior.getName());
        assertEquals(75, warrior.getStrength());
        assertEquals(100, warrior.getHealth());
        assertEquals(100, warrior.getStamina());
        assertEquals(50, warrior.getSpeed());
        assertEquals(10, warrior.getAttackPower());
        assertEquals(100, warrior.getShieldStrength());
        assertEquals(false, warrior.getRunning());
        assertEquals(false, warrior.getArrested());
        assertEquals(75, warrior.getStrength());
        assertEquals("Attack another character", warrior.getAbilities());

    }

}