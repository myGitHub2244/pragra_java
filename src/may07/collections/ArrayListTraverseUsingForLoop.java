package may07.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTraverseUsingForLoop {

    public static void main(String[] args) {

            List<Integer> list1=new ArrayList<>();
            list1.add(10);
            list1.add(20);
            list1.add(30);
            list1.add(40);

        //Print the ArrayList
        System.out.println("list1 = " + list1);

        System.out.println("Traverse ArrayList using For Loop");
        //Traverse the ArrayList using for loop:
        for(int x=0;x<list1.size();x++){
            System.out.println("Element: "+list1.get(x));
        }

        System.out.println("Traverse ArrayList using For-Each Loop");
        //Traverse the ArrayList using for-each loop:
        for(Integer element : list1){
            System.out.println("Element: "+ element);
        }


    }


}
