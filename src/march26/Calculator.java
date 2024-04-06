package march26;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Welcome to my Calculator !");
        System.out.println("    Press 1 for Addition");
        System.out.println("    Press 2 for Multiplication");
        System.out.println("    Press 3 for Subtraction");
        System.out.println("    Press 4 for Division");
        System.out.println("    Press 5 for Modulus");
        System.out.println("    Press 0 for Exit");

        System.out.println("Enter your choice: ");


        Scanner sc=new Scanner(System.in);

        int x = sc.nextInt();
        double firstNum;
        double secondNum;
        double outPut;

        switch(x){

            case 1:
                System.out.println("Please enter your 2 numbers to Add:");
                firstNum = sc.nextDouble();
                secondNum = sc.nextDouble();
                outPut = firstNum+secondNum;
                System.out.println("Addition: " + outPut);
                break;

            case 2:
                System.out.println("Please enter your 2 numbers to Multiply:");
                firstNum = sc.nextDouble();
                secondNum = sc.nextDouble();
                outPut = firstNum*secondNum;
                System.out.println("Multiplication: " + outPut);
                break;

            case 3:
                System.out.println("Please enter your 2 numbers to Subtract:");
                firstNum = sc.nextDouble();
                secondNum = sc.nextDouble();
                outPut = firstNum-secondNum;
                System.out.println("Subtraction: " + outPut);
                break;

            case 4:
                System.out.println("Please enter your 2 numbers to Divide:");
                firstNum = sc.nextDouble();
                secondNum = sc.nextDouble();
                outPut = firstNum/secondNum;
                System.out.println("Division: " + outPut);
                break;

            case 5:
                System.out.println("Please enter your 2 numbers to Mod:");
                firstNum = sc.nextDouble();
                secondNum = sc.nextDouble();
                outPut = firstNum%secondNum;
                System.out.println("Modulus: " + outPut);
                break;

            case 0:
                System.out.println("Exit");
                break;


            default:
                System.out.println("Invalid Option selected. Exiting !!");

        }

        sc.close();


    }

}
