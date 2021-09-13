/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Andrew Hicks
 */

package org.example;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter the number of the month: ");
        int m = n.nextInt();
        String month;
        switch(m){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + m);
        }
        System.out.println("The name of the month is " + month);
    }
}
