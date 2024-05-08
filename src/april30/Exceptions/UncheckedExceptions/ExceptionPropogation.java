package april30.Exceptions.UncheckedExceptions;

import java.util.Scanner;

public class ExceptionPropogation {
    public static void main(String[] args) {
        calculator(); // 1
    }

    public static void calculator(){
        divNumber(); // 2
    }

    public static void divNumber () { // 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the first Number ");
        int num2 = scanner.nextInt();
        int result = 0;
        try {
            result = num1 / num2;
        }

        catch (java.lang.NullPointerException e) {
            System.out.println(e);
        }

    }
}
