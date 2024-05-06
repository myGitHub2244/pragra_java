package assignment.exceptionhandling;

import java.util.Scanner;

public class DrivingTestUsingThrow {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int x= sc.nextInt();

        if(x<18||x>100){
        //when we "throw" we have to provide try-catch block OR add throws to method else it gives error "Unhandled exception: assignment.exceptionhandling.InvalidAgeException"

            try {
                throw new InvalidAgeException("Your age is outside the limits for Driving Test");
            }
            catch (Exception e){
                System.out.println("Inside Catch");
                e.printStackTrace();
            }
            finally {
                System.out.println("Inside Finally: Close connections");
                sc.close();
            }
        }
        else System.out.println("Your age is valid for Driving Test !");

        System.out.println("Processing Ends");  //this will print in case of exception is handled via THROW
    }


}
