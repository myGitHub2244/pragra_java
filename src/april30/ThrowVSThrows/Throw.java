package april30.ThrowVSThrows;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = null;

        try {
            System.out.println("Inside Try block");
            scanner = new Scanner(System.in);
            String upperCase = s.toUpperCase();
            System.out.println("Something..THIS WILL NOT PRINT");
        }
        catch (NullPointerException e) {        //Note: Catch block is not mandatory. No errors if omitted. Try it out !
            System.out.println("Inside Catch block");
            e.printStackTrace();
            throw new RuntimeException(e);  //this will throw additional exception manually. In this case only finally is executed
        }
        finally {
            // connection sql, opened file,
            System.out.println("It will execute always.");
            scanner.close();
        }
        System.out.println("Processing Ends");  //this won't print if "throw" is executed. Comment out "throw" and see it will print !

        // try with resources..

    }
}

