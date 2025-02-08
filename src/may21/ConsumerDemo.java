package may21;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public void printString(Consumer<Integer> cons){

//  Use Consumer interface implemented function accept() to print the given input:
        int i=112;
        cons.accept(i);     //basically accept(i) method is implemented as System.out.println(i)

//  Use Consumer interface implemented function accept() to print elements of ArrayList:
        List<Integer> list = Arrays.asList(11,22,33,44);
        list.forEach(cons);             //lambda function passed as a parameter

    }

    public static void main(String[] args) {
        ConsumerDemo fun=new ConsumerDemo();
        fun.printString(t -> System.out.println("Printing: "+t));   //implement the accept() method of Consumer Interface
                                                                    // and pass it as a function parameter

        /*
        Above Lambda expression is short form of below implementation:
        Consumer<Integer> cons = new Consumer<>{            --> Anonymous class
            public void accept(int i){                        --> Override the abstract method accept()
                System.out.println("Printing: "+i);
            }
        };

        For Reference
        --------------------------------------------------
        @FunctionalInterface
        public interface Consumer<T> {
         * Performs this operation on the given argument.
         *
         * @param t the input argument
            void accept(T t);
         */

    }


}
