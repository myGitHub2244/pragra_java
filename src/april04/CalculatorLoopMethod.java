package april04;

import java.util.Scanner;

public class CalculatorLoopMethod {
    double firstNum;
    double secondNum;
    int inputOper;
    double outPut;

    public void printMenu(){
            System.out.println("Welcome to my Calculator !");
            System.out.println("    Press 1 for Addition");
            System.out.println("    Press 2 for Multiplication");
            System.out.println("    Press 3 for Subtraction");
            System.out.println("    Press 4 for Division");
            System.out.println("    Press 5 for Modulus");
            System.out.println("    Press 0 for None");
            System.out.print("Enter your choice of Arithmetic Operation: ");
    }

    public void getInput(Scanner sc){
         inputOper = sc.nextInt();
    }
    public void getFirstNum(Scanner sc){
        System.out.println("Please enter first number:");
        firstNum = sc.nextDouble();
    }
    public void getSecondNum(Scanner sc){
        System.out.println("Please enter second number:");
        secondNum = sc.nextDouble();
    }
    public void performCalc(Scanner sc){
        switch(inputOper){
            case 1:
                getFirstNum(sc);
                getSecondNum(sc);
                outPut = firstNum+secondNum;
                System.out.println("Addition of "+firstNum+ " and "+secondNum+ " is: " + outPut);
                break;
            case 2:
                getFirstNum(sc);
                getSecondNum(sc);
                outPut = firstNum*secondNum;
                System.out.println("Multiplication of "+firstNum+ " and "+secondNum+ " is: " + outPut);
                break;
            case 3:
                getFirstNum(sc);
                getSecondNum(sc);
                outPut = firstNum-secondNum;
                System.out.println("Subtraction of "+firstNum+ " and "+secondNum+ " is: " + outPut);
                break;
            case 4:
                getFirstNum(sc);
                getSecondNum(sc);
                outPut = firstNum/secondNum;
                System.out.println("Division of "+firstNum+ " and "+secondNum+ " is: " + outPut);
                break;
            case 5:
                getFirstNum(sc);
                getSecondNum(sc);
                outPut = firstNum%secondNum;
                System.out.println("Modulus of "+firstNum+ " and "+secondNum+ " is: " + outPut);
                break;
            case 0:
                System.out.println("None selected");
                break;
            default:
                System.out.println("Invalid Option selected!");
        }
    }

    public char checkContinue(Scanner sc){
        char contSwitch;
        System.out.println("Do you want to continue? Press \"Y\" for Yes or \"N\" for No");
        contSwitch=sc.next().charAt(0);

        while(contSwitch!='y' && contSwitch!='Y' && contSwitch!='n' && contSwitch!='N') {
            System.out.println("Invalid Entry. Please press \"Y\" for yes or \"N\" for No");
            contSwitch=sc.next().charAt(0);
        }
        return contSwitch;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        CalculatorLoopMethod cal=new CalculatorLoopMethod();
        char contSwitch;

        do{
            cal.printMenu();
            cal.getInput(sc);
            cal.performCalc(sc);
            contSwitch=cal.checkContinue(sc);
        }while(contSwitch=='y'||contSwitch=='Y');

        System.out.println("Calculator is exiting. Thank you! ");
        sc.close();
    }
}
