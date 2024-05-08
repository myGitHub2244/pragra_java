package april30.Exceptions;

import java.util.Scanner;

public class TryCatchBlock {
    public static void main(String[] args) {

        /*
        Unchecked Exceptions
        An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions.
        These include programming bugs, such as logic errors or improper use of an API.
        Runtime exceptions are ignored at the time of compilation and occur at Runtime if situation arise and program terminates abruptly.
        We can put that code within Try-Catch block so that meaningful error message is displayed and execution can continue after Catch
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the first Number ");
        int num2 = scanner.nextInt();
        int result = 0;
        try {
             result = num1 / num2;
            System.out.println("Result before correction: "+result);    //this won't execute if num2 is '0'
        }

        catch (java.lang.NullPointerException e) {  //Skipped
            System.out.println(e);
        }
        
        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("num2 entered is 0. below code to replace it will 1 ");
            //Write code to correct the error and continue processing !
            num2=1;
            result=num1/num2;
            System.out.println("result after correction: "+result);
        }

        catch (Exception e) {   //Skipped
            System.out.println(e);
        }

        System.out.println("Result: "+result);      //Since Exception is handled above, code execution continues after catch block
        System.out.println("End of the result.."); //Since Exception is handled above, code execution continues after catch block

    }
}
