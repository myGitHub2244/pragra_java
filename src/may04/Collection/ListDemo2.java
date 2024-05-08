package may04.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();
        list1.add(10);list1.add(20);list1.add(30);list1.add(10);
        System.out.println("Size: "+list1.size());
        System.out.println("list1 = " + list1);

        list1.add(2,50);    //insert an element at index 2
        System.out.println("Size: "+list1.size());
        System.out.println("list1 = " + list1);

        list1.set(2,25);
        System.out.println("Size: "+list1.size());
        System.out.println("list1 = " + list1);


        System.out.println("list1.contains(40) = " + list1.contains(40));
        System.out.println("list1.hashCode() = " + list1.hashCode());
        System.out.println("list1.isEmpty() = " + list1.isEmpty());
        System.out.println("list1.subList(1,2) = " + list1.subList(1, 2));  //from-index (incl) to to-index (exclusive)
        System.out.println("list1.indexOf(10) = " + list1.indexOf(10));
        System.out.println("list1.lastIndexOf(10) = " + list1.lastIndexOf(10));
        System.out.println("list1.toArray() = " + list1.toArray());

    }



}
