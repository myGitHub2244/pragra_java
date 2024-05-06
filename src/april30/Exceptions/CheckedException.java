package april30.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {

        /*
        Checked Exceptions
        A checked exception is an exception that is checked (notified) by the compiler at compilation-time,
        these are also called as compile time exceptions. These exceptions cannot simply be ignored,
        the programmer should take care of (handle) these exceptions by putting in try-catch block.
         */

        File file = new File("nofile.txt");
//        Scanner scanner = new Scanner(file);

        /*
        Above code is CHECKED  at Compile time itself and shows red highlighted error: "Unhandled exception: java.io.FileNotFoundException"
        Hence it mandates us to put the code in try-catch block as shown below
         */

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {         //Checked Exception. Meaning Compile mandates this
            System.out.println("File not found");
            e.printStackTrace();
            throw new RuntimeException(e);  //throw additional exception Runtime Exception passing same object e
        }


//        Thread.sleep(5000);
        /*
        Above code is CHECKED  at Compile time itself and shows red highlighted error: Unhandled exception: java.lang.InterruptedException
        Hence it mandates us to put it in try-catch block.
         */

        try {
            System.out.println("Hello");
            Thread.sleep(5000);
            System.out.println("Hello after sleep ");
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
