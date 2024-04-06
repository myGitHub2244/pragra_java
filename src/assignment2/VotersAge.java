package assignment2;

import java.util.Arrays;
import java.util.Scanner;

//Write a Java program that takes a user's age as input and determines whether they are eligible to vote or not.
public class VotersAge {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age to check eligible to Vote: ");
        int age=sc.nextInt();

        if(age>=18) System.out.println("You are eligible to Vote!");
        else System.out.println("You are not eligible to Vote!");

        sc.close();
    }
}
