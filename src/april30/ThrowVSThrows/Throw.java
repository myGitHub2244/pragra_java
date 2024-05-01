package april30.ThrowVSThrows;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = null;

        try {
            scanner = new Scanner(System.in);
            String upperCase = s.toUpperCase();
            System.out.println("Somnething..");
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        finally {

            System.out.println("It will execute always.");
            scanner.close();
        }

        // connection sql, opened file,

        scanner.close();

        // try with resources..

    }
}
// Ask user to enter the age...
//
// 16 -- InvalidAgeException.
//  16-18 --- you eligible to learn dribing
// 18 -- okay


// Ask user to enter the age...  Vote...
//
// 16 -- InvalidAgeException.
//  16-18 --- you eligible to learn dribing
// 18 -- okay

