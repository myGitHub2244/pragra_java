package april30.Exceptions.CheckedExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionDemo {
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
            System.out.println("Statement after file operation");   //this is not printed incase of exception
        }
        catch (FileNotFoundException e) {         //Checked Exception. Meaning Compile mandates this
            System.out.println("File not found");
            e.printStackTrace();
//            throw new RuntimeException(e);  //throw additional exception Runtime Exception passing same object e
        }

        System.out.println("Processing ends");  //this won't print if "throw" code is uncommented ELSE it prints !
    }
}
