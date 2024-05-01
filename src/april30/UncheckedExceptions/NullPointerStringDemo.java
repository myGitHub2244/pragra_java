package april30.UncheckedExceptions;

public class NullPointerStringDemo {
    public static void main(String[] args) {

        String s = null;

        //Exception in thread "main" java.lang.NullPointerException

        String upperCase = s.toUpperCase();
        System.out.println(upperCase);
        System.out.println("Hello after line 10 ");


    }
}
