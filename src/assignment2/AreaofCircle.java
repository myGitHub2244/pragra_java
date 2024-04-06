package assignment2;

import java.util.Scanner;
//write a Java program to calculate the area of circle.

public class AreaofCircle {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.print("Enter radius of circle to calculate Area: ");
        int radius=sc.nextInt();

        System.out.println("Area of circle is: "+ Math.PI*Math.pow(radius,2));

        sc.close();
    }
}
