package com.company;

import com.company.interfaces.Converter;


public class ConverterIf implements Converter {

    public String convertMonth(int monthNumber) {

        String jan = "January";
        String feb = "February";
        String mar = "March";
        String apr = "April";
        String may = "May";
        String june = "June";
        String july = "July";
        String aug = "August";
        String sept = "September";
        String oct = "October";
        String nov = "November";
        String dec = "December";



        if(monthNumber == 1) {
            return jan;
        } else if(monthNumber == 2) {
            return feb;
        } else if(monthNumber == 3) {
            return mar;
        } else if(monthNumber == 4) {
            return apr;
        } else if(monthNumber == 5) {
            return may;
        } else if(monthNumber == 6) {
            return june;
        } else if(monthNumber == 7) {
            return july;
        } else if(monthNumber == 8) {
            return aug;
        } else if(monthNumber == 9) {
            return sept;
        } else if(monthNumber == 10) {
            return oct;
        } else if(monthNumber == 11) {
            return nov;
        } else if(monthNumber == 12) {
            return dec;
        }
        return "Your input is invalid";
    }

    @Override
    public String convertDay(int dayNumber) {
        return null;
    }


}
