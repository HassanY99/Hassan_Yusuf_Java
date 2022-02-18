package com.company;

public class App {

    public static void main(String[] args) {

        LeadCharacter farmer = new Farmer();
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

        System.out.println("------------- Farmer ----------------");
        System.out.println(farmer.getName());
        System.out.println(farmer.getStrength());
        System.out.println(farmer.getHealth());
        System.out.println(farmer.getStamina());
        System.out.println(farmer.getSpeed());
        System.out.println(farmer.getAttackPower());
        System.out.println(farmer.getRunning());
        System.out.println(farmer.getArrested());
        System.out.println(farmer.getPlowing());
        System.out.println(farmer.getHarvesting());
        System.out.println(farmer.getAbilities());
        System.out.println("---------------------------------------");

        LeadCharacter constable = new Constable();
        constable.setName("Constable");
        constable.setStrength(60);
        constable.setHealth(100);
        constable.setStamina(60);
        constable.setSpeed(20);
        constable.setAttackPower(5);
        constable.setRunning(false);
        constable.setArrested(false);
        constable.setJurisdiction("Has the authority to make legal decisions");
        constable.setAbilities("Arrest another character" + " and Attack another character");


        System.out.println("------------- Constable ----------------");
        System.out.println(constable.getName());
        System.out.println(constable.getStrength());
        System.out.println(constable.getHealth());
        System.out.println(constable.getHealth());
        System.out.println(constable.getStamina());
        System.out.println(constable.getSpeed());
        System.out.println(constable.getAttackPower());
        System.out.println(constable.getRunning());
        System.out.println(constable.getArrested());
        System.out.println(constable.getJurisdiction());
        System.out.println(constable.getAbilities());
        System.out.println("---------------------------------------");

        LeadCharacter warrior = new Warrior();
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

        System.out.println("------------- Warrior ----------------");
        System.out.println(warrior.getName());
        System.out.println(warrior.getStrength());
        System.out.println(warrior.getHealth());
        System.out.println(warrior.getStamina());
        System.out.println(warrior.getSpeed());
        System.out.println(warrior.getAttackPower());
        System.out.println(warrior.getShieldStrength());
        System.out.println(warrior.getRunning());
        System.out.println(warrior.getArrested());
        System.out.println(warrior.getAbilities());
        System.out.println("---------------------------------------");
//



    }
}
