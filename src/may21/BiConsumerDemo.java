package may21;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {

        int a=30;
        int b=20;

        BiConsumer<Integer,Integer> biCon = (x, y) -> {
            if (x>y) System.out.println("x is greater than y");
            else System.out.println("x is smaller than y");
        };

        biCon.accept(a,b);

    }


}
