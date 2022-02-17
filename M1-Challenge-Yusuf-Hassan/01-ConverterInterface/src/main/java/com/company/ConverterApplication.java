package com.company;

import com.company.interfaces.Converter;
import com.company.ConverterIf;

import java.util.Scanner;

public class ConverterApplication  {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Converter monthConverter = new ConverterIf();
        Converter dayConverter = new ConverterSwitch();

        System.out.println("Please enter a number between 1 to 12 to get its corresponding month?");
        String userMonth = monthConverter.convertMonth(Integer.parseInt(scan.nextLine()));
        System.out.println(userMonth);


        System.out.println("Please enter a number between 1 to 7 to get its corresponding day of the week?");
        String userDay = dayConverter.convertDay(Integer.parseInt(scan.nextLine()));
        System.out.println(userDay);

    }


}
