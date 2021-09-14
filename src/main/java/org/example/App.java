/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        int month = in.nextInt();
        String month_name;
        switch (month) {
            case 1:  month_name = "January";
                break;
            case 2:  month_name = "February";
                break;
            case 3:  month_name = "March";
                break;
            case 4:  month_name = "April";
                break;
            case 5:  month_name = "May";
                break;
            case 6:  month_name = "June";
                break;
            case 7:  month_name = "July";
                break;
            case 8:  month_name = "August";
                break;
            case 9:  month_name = "September";
                break;
            case 10: month_name = "October";
                break;
            case 11: month_name = "November";
                break;
            case 12: month_name = "December";
                break;
            default: month_name = "Invalid month";
                break;
        }
        System.out.println("The name of this month is " + month_name + ".");

        in.close();
    }
}