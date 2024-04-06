package march23;

public class PrintPrintln {
    public static void main(String[] args) {

//      print will not insert any new line after printing the String
        System.out.print("Hello");
        System.out.print("World");

//      println will insert a blank line BUT ONLY after printing
        System.out.println("Hello");
        System.out.print("World");

        System.out.println("Hello");
        System.out.println("World");

        System.out.println("There is a blank above due to println of World above");
    }

}
