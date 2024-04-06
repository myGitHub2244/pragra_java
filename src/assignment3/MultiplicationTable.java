package assignment3;

//write product table of a give number in specific format e.g. 5 * 1 = 5

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("*** Table of 5 ***");
        int tableof=5;
        int multiplier=1;

        do{
            System.out.println("5 x "+multiplier +" = " +multiplier*tableof);
            multiplier++;
        }while(multiplier<=10);

    }
}
