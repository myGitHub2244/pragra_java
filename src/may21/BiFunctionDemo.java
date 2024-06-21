package may21;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {

        int x=10,y=20;

        BiFunction<Integer,Integer,Integer> biFUnc= (a,b) -> a*b;

        System.out.println("Output of BiFUnction: "+ biFUnc.apply(x,y));


    }


}
