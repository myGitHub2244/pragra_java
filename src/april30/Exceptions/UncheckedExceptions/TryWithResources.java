package april30.Exceptions.UncheckedExceptions;

import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {

        int x;

        //Scanner implements Closeable, AutoCloseable hence we can use inside try with resources block.
        // Then we do not need to close() in Finally block
        try(Scanner sc=new Scanner(System.in)){

            x = sc.nextInt();
            System.out.println("x = " + x);
        }
//        finally {                     finally is not needed to close file since we alrdy used try with resources
//            sc.close();
//        }


    }


}
