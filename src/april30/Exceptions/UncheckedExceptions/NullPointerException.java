package april30.Exceptions.UncheckedExceptions;

public class NullPointerException {

    public static void main(String[] args) {
        String str=null;
//        System.out.println(str.length());     --> Uncomment (and Comment out Try-Catch) this to see Run time Exception

        try{
            System.out.println(str.length());       //Run time exception is avoided by Catch Block
        }
        catch (java.lang.NullPointerException e){
            e.printStackTrace();
            System.out.println("Inside Catch block");
        }
        finally {
            System.out.println("Inside Finally Block");
        }

        System.out.println("End of code");


    }


}
