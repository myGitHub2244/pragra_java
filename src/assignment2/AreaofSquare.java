package assignment2;

import java.util.Scanner;

//write a Java program to find the area of square.
public class AreaofSquare {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side of Square to calc Area: ");
        int side=sc.nextInt();

        System.out.println("Area of Square is: "+ side*side);

        sc.close();
    }
}
