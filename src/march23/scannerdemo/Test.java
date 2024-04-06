package march23.scannerdemo;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //          Add 2 numbers from user input
        System.out.println("Enter the value of x:");
        int x = scanner.nextInt();

        System.out.println("Enter the value of y:");
        int y = scanner.nextInt();

        int sum = x+y;
        System.out.println("Sum of x and y is: " + sum);

        //      Multiply 2 numbers from user input
        System.out.println("Enter the value of x:");
        x = scanner.nextInt();

        System.out.println("Enter the value of y:");
        y = scanner.nextInt();

        int mult = x*y;
        System.out.println("Multiplication of x and y is: " + mult);

        //      Divide 2 numbers from user input
        System.out.println("Enter the value of x:");
        x = scanner.nextInt();

        System.out.println("Enter the value of y:");
        y = scanner.nextInt();

        float div = x/y;
        System.out.println("Division of x and y is: " + div);


    }

}
