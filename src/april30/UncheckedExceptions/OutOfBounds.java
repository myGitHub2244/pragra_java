package april30.UncheckedExceptions;

public class OutOfBounds extends Throwable {

    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};

//        System.out.println(arr[6]);       --> Uncomment this  (and Comment out Try-Catch) to see Run time Exception


        try{
            System.out.println(arr[6]);     //Run time exception is avoided by Catch Block
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Inside Catch block for Array Out of Bounds");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Inside Catch block for Exception");
        }
        finally {
            System.out.println("Inside Finally Block");
        }

        System.out.println("End of code");


    }


}
