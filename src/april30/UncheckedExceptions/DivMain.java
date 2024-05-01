package april30.UncheckedExceptions;

import java.util.Scanner;

public class DivMain {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the first Number ");
        int num2 = scanner.nextInt();
        int result = 0;
        try {
             result = num1 / num2;
            System.out.println("Not useful");
        }

        catch (java.lang.NullPointerException e) {
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (Exception e) {

            System.out.println(e);
        }

        System.out.println("Result: "+result);      //Since Exception is handled above, code execution continues after catch block
        System.out.println("End of the result.."); //Since Exception is handled above, code execution continues after catch block

    }
}

// 5 -10
// NullPointer , ArrayOutOfBound exception