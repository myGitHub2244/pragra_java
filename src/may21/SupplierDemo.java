package may21;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<Double> supp = () -> Math.random()*100;

        int i=0;
        double y=1;
        while(i<5){
            System.out.println("Random number "+supp.get());
            y=y*supp.get();
            i++;
        }

        System.out.println("Final y: "+y);
    }


}
