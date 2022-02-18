package com.company;

import com.company.interfaces.Converter;
import com.company.ConverterIf;

import java.util.Scanner;

public class ConverterApplication  {

    public static void main(String[] args) {


        Converter monthConverter = new ConverterIf();
        Converter dayConverter = new ConverterSwitch();

        System.out.println("========= If/else statements for ConvertMonth ==========");
        String month = monthConverter.convertMonth(1);
        System.out.println(month);
        String month1 = monthConverter.convertMonth(6);
        System.out.println(month1);
        String monthError = monthConverter.convertMonth(14);
        System.out.println(monthError);
        System.out.println("========= switch statements for ConvertDay ==========");
        String day = dayConverter.convertDay(3);
        System.out.println(day);
        String day1 = dayConverter.convertDay(6);
        System.out.println(day1);
        String dayError = dayConverter.convertDay(9);
        System.out.println(dayError);

    }


}
