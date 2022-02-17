package com.company;

import com.company.interfaces.Converter;

public class ConverterSwitch implements Converter {


    public String convertDay(int dayNumber) {
        int day = dayNumber;
        String dayString;

        switch (day) {
            case 1:
                dayString = "Sunday";
                break;
            case 2:
                dayString = "Monday";
                break;
            case 3:
                dayString = "Tuesday";
                break;
            case 4:
                dayString = "Wednesday";
                break;
            case 5:
                dayString = "Thursday";
                break;
            case 6:
                dayString = "Friday";
                break;
            case 7:
                dayString = "Saturday";
                break;
            default:
                dayString = "Invalid day";
        }
        return dayString;
    }



    @Override
    public String convertMonth(int monthNumber) {
        return null;
    }
}
