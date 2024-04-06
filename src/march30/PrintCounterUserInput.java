package march30;

import java.util.Scanner;

//write java program to find the sum of first n natural numbers

public class PrintCounterUserInput {

    public static void main(String[] args) {

    int counter=0;
    int sum=0;

        System.out.print("Enter the number up to which you want to sum:");
        Scanner sc=new Scanner(System.in);

        counter=sc.nextInt();
        int loopV=1;

        while(loopV<=counter){
        sum +=loopV;
        loopV++;
        }

        System.out.println("Sum: "+sum);
    }
}
