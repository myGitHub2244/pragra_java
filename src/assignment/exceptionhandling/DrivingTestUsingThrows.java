package assignment.exceptionhandling;

import java.util.Scanner;

public class DrivingTestUsingThrows {

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int x= sc.nextInt();

        if(x<18||x>100){
        //when we "throw" we have to provide try-catch block OR add throws to method else it gives error "Unhandled exception: assignment.exceptionhandling.InvalidAgeException"
            throw new InvalidAgeException("Your age is outside the limits for Driving Test");
        }
        else System.out.println("Your age is valid for Driving Test !");

        sc.close();
        System.out.println("Processing Ends");  //this won't print in case of exception is handled via THROWS
    }


}
