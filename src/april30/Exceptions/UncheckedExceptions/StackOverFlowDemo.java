package april30.Exceptions.UncheckedExceptions;

public class StackOverFlowDemo {
    public static void main(String[] args) {
        test();
    }


    //Infinite Loop will cause: Exception in thread "main" java.lang.StackOverflowError

    public static void test(){
        show();
    }

    public static void show(){ test();}
}
