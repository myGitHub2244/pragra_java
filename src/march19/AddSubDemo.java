package march19;

public class AddSubDemo {

    public static void main(String args[]){
        int x = 25;
        int y = 75;
        int diff = x-y;
        System.out.println("Subtraction: " + diff);

        diff -=diff+10;
        System.out.println("diff = " + diff);

        int sum = x+y;
        System.out.println("Addition = " + sum);

        sum +=sum+10;
        System.out.println("sum = " + sum);


        System.out.println(x+y);
        System.out.println("add: " + x+y);
        System.out.println(x*y);




    }
}
