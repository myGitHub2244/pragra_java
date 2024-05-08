package april30.Exceptions.CheckedExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InterruptedExceptionDemo {
    public static void main(String[] args) {

        /*
        Checked Exceptions
        A checked exception is an exception that is checked (notified) by the compiler at compilation-time,
        these are also called as compile time exceptions. These exceptions cannot simply be ignored,
        the programmer should take care of (handle) these exceptions by putting in try-catch block.
         */

        //        Thread.sleep(5000);
        /*
        Above code is CHECKED  at Compile time itself and shows red highlighted error: Unhandled exception: java.lang.InterruptedException
        Hence it mandates us to put it in try-catch block.
         */

        try {
            System.out.println("Hello");
            Thread.sleep(5000);     //Although this is in try block it is not neccessary it will cause exception !
            System.out.println("Hello after sleep ");
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Processing Ends");
    }
}
