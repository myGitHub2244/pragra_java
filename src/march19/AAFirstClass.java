package march19;

public class AAFirstClass {
    public static void main(String args[]){
        System.out.println("Hello Java");

        //"out" is an instance variable of type PrintStream. It is defined in System class. "println" is a method in PrintStream
        //System -> has-a instance variable "out" of type PrintStream -> use "out" to call method "println" of class PrintStream
        System.out.println("Hello World");
    }
}
