package assignment2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//Create a Java program that takes a numerical month input (1-12) and outputs the corresponding month name using a switch case.

public class GetMonth {

    public static void main(String[] args) {

        String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

        System.out.print("Enter the number i.e. MM to fetch the Month of Year: ");

        Scanner sc=new Scanner(System.in);
        int mm=sc.nextInt();
        mm--;
        if(mm>=0 && mm<=11)
        System.out.println("Month is: "+month[mm]);
        else System.out.println("Invalid MM value entered !");

        //Using Switch case (if we want to not use an array):

        mm++;
        switch(mm){
            case 1:
                System.out.println("Switch: Month is: January" );
                break;
            case 2:
                System.out.println("Switch: Month is: February");
                break;
            case 3:
                System.out.println("Switch: Month is: March");
                break;
            case 4:
                System.out.println("Switch: Month is: April");
                break;
            case 5:
                System.out.println("Switch: Month is: May");
                break;
            case 6:
                System.out.println("Switch: Month is: June");
                break;
            case 7:
                System.out.println("Switch: Month is: July");
                break;
            case 8:
                System.out.println("Switch: Month is: August");
                break;
            case 9:
                System.out.println("Switch: Month is: September");
                break;
            case 10:
                System.out.println("Switch: Month is: October");
                break;
            case 11:
                System.out.println("Switch: Month is: November");
                break;
            case 12:
                System.out.println("Switch: Month is: December");
                break;
            default:
                System.out.println("Switch: Invalid number MM entered !");
        }


        sc.close();
    }
}
