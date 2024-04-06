package assignment2;

import java.util.Scanner;

//Implement a Java program that takes a day of the week as input and outputs whether it's a weekday or a weekend using a switch case.
public class CheckWeekday {

    public static void main(String[] args) {

        String weekdays[]={"Monday","Tuesday","Wednesday","Thursday","Friday"};
        String weekends[]={"Sunday","Saturday"};
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter day of the week to check if Weekday or Weekend: ");
        String weekday=sc.next();

        boolean daymatch=false;

        for(String str:weekdays){
            if(str.equalsIgnoreCase(weekday)) { //cannot use '==' since String is non-primitive datatype hence results in comparing objects and not String values
                System.out.println("For_loop: Day entered is a Weekday!");
                daymatch=true;
                break;
            }
        }

        if(daymatch==false) {
            for (String str : weekends) {
                if (str.equalsIgnoreCase(weekday)) { //cannot use '==' since String is non-primitive datatype hence results in comparing objects and not String values
                    System.out.println("For_loop: Day entered is a Weekend!");
                    daymatch=true;
                    break;
                }
            }
        }

        if(daymatch==false) {
           System.out.println("For_loop: Invalid day entered !");
        }

        //Code using a Switch:

        switch (weekday){
                case "Sunday":
                case "Saturday":
                    System.out.println("Switch: Day entered is a Weekend!");
                    break;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Switch: Day entered is a Weekday!");
                break;
            default:
                System.out.println("Switch: Invalid day entered !");
        }

        sc.close();
    }
}
