package march19;

public class DataTypeDemo {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int x = 2147483647;
        long l = 123456;
//        float e = 200.20;     --> gives error since default of decimal is double. to typecast suffix with 'f'
        float f = 200.20f;
        double d = 123456.78;
        boolean isRaining = true;
        char c = 'c';

        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("x = " + x);
        System.out.println("l = " + l);
//        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("isRaining = " + isRaining);
        System.out.println("c = " + c);
    }
}
