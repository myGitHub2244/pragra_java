package march23.decisionmaking;

public class IfElse {

    public static void main(String[] args) {
        boolean isRaining = false;

        if(isRaining){
            System.out.println("I am going to take Umbrella today");
        }
        else{
            System.out.println("I am going to take Sunglasses today");
        }

        //Check number is positive or negative
        int x=-10;
        if (x>0){
            System.out.println("Number is positive: " +x);
        }
        else{
            System.out.println("Number is negative: " +x);
        }

        //Check number is Odd or even
        int a = 3;
        if (a%2==0){
            System.out.println("Even number: "+ a);
        }
        else{
            System.out.println("Odd number: " +a);
        }

        //Check year is Leap or Non-Leap year
        int y=2024;
        if (y%4==0){
            System.out.println("Leap Year: " +y);
        }
        else{
            System.out.println("Not Leap Year: "+y);
        }

    }
}
