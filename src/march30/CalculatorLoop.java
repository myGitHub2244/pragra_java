package march30;

import java.util.Scanner;

public class CalculatorLoop {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double firstNum;
        double secondNum;
        double outPut;
        char contSwitch='y';

        do{
            System.out.println("Welcome to my Calculator !");
            System.out.println("    Press 1 for Addition");
            System.out.println("    Press 2 for Multiplication");
            System.out.println("    Press 3 for Subtraction");
            System.out.println("    Press 4 for Division");
            System.out.println("    Press 5 for Modulus");
            System.out.println("    Press 0 for None");

            System.out.print("Enter your choice of Arithmetic Operation: ");

            int inputOper = sc.nextInt();

        switch(inputOper){

            case 1:
                System.out.println("Please enter first number to Add:");
                firstNum = sc.nextDouble();
                System.out.println("Please enter second number to Add:");
                secondNum = sc.nextDouble();
                outPut = firstNum+secondNum;
                System.out.println("Addition of "+firstNum+ " and "+secondNum+ " is: " + outPut);
                break;

            case 2:
                System.out.println("Please enter first number to Multiply:");
                firstNum = sc.nextDouble();
                System.out.println("Please enter first number to Multiply:");
                secondNum = sc.nextDouble();
                outPut = firstNum*secondNum;
                System.out.println("Multiplication of "+firstNum+ " and "+secondNum+ " is: " + outPut);
                break;

            case 3:
                System.out.println("Please enter first number to Subtract:");
                firstNum = sc.nextDouble();
                System.out.println("Please enter first number to Subtract:");
                secondNum = sc.nextDouble();
                outPut = firstNum-secondNum;
                System.out.println("Subtraction of "+firstNum+ " and "+secondNum+ " is: " + outPut);
                break;

            case 4:
                System.out.println("Please enter first number to Divide:");
                firstNum = sc.nextDouble();
                System.out.println("Please enter first number to Divide:");
                secondNum = sc.nextDouble();
                outPut = firstNum/secondNum;
                System.out.println("Division of "+firstNum+ " and "+secondNum+ " is: " + outPut);
                break;

            case 5:
                System.out.println("Please enter first number to Mod:");
                firstNum = sc.nextDouble();
                System.out.println("Please enter first number to Mod:");
                secondNum = sc.nextDouble();
                outPut = firstNum%secondNum;
                System.out.println("Modulus of "+firstNum+ " and "+secondNum+ " is: " + outPut);
                break;

            case 0:
                System.out.println("None selected");
                break;


            default:
                System.out.println("Invalid Option selected!");

        }

        System.out.println("Do you still want to continue? Press \"Y\" for yes or \"N\" for No");
        contSwitch=sc.next().charAt(0);

        while(contSwitch!='y' && contSwitch!='Y' && contSwitch!='n' && contSwitch!='N') {
                System.out.println("Invalid Entry. Please press \"Y\" for yes or \"N\" for No");
            contSwitch=sc.next().charAt(0);
        }

        if(contSwitch!='y' || contSwitch!='Y') {
            System.out.println("Calculator is exiting. Thank you! ");
        }
        }while(contSwitch=='y'||contSwitch=='Y');

        sc.close();


    }

}
