package march19;

public class MultiplyDivisionModulus {

    public static void main(String args[]){
        int x = 75;
        int y = 25;
        int mult = x * y;
        int div = x / y;
        System.out.println("Multiply: " + mult);
        System.out.println("Divide: " + div);

        float a = 10;
        float b = 3;
        float c = a/b;
        System.out.println("Divide Float into Float: "+c);

        int d = 10;
        int e = 3;
        float f = d/e;
        System.out.println("Divide Int into Float: "+f);

        int j = 10;
        int k = 3;
        int mod = j % k;
        System.out.println("Modulus: " + mod);


    }
}
