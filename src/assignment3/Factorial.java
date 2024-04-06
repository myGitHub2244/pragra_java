package assignment3;

import java.util.Scanner;

//Implement a program to find the factorial of a given number using a while loop.

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Enter the number to calculate Factorial: ");
        Scanner sc=new Scanner(System.in);

        int counter=sc.nextInt();
        int fact=1;

        do{
            fact = fact*counter;
            counter--;
        }while(counter>0);

        System.out.println("Factorial is: "+fact);

    }
}
