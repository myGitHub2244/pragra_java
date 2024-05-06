package may4.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<Integer> list = List.of(10, 20, 30);
        System.out.println("list = " + list);

        List arr=Arrays.asList(10,20,30);
        System.out.println("arr = " + arr);

        ArrayList list1=new ArrayList();        //heterogeneous array
        System.out.println("list1.size() = " + list1.size());       //initial size is 0
        list1.add(10);
        list1.add(20);
        list1.add("Pragra");
        System.out.println("list1.size() = " + list1.size());
        System.out.println("list1 = " + list1);


        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(10);
        list2.add(20);
//        list2.add("Pragra");      //java: no suitable method found for add(java.lang.String)
        System.out.println("list2 = " + list2);

        List<Integer> rev = list2.reversed();
        System.out.println("rev = " + rev);

        ArrayList<String> list3=new ArrayList<>();
        list3.add("Canada");
        list3.add("India");
//        list2.add(10);      //incompatible data-type
        System.out.println("list3 = " + list3);



        LinkedList<String> list4=new LinkedList<>();
        System.out.println("list4.size() = " + list4.size());       //initial size is 0
        list4.add("Pankaj");
        list4.add("Toronto");
        list4.add("Pragra");
        System.out.println("list4.size() = " + list4.size());
        System.out.println("list4 = " + list4);

        list4.addAll(list3);        //Add a ArrayList to a LinkedList !
        System.out.println("list4 = " + list4);
        System.out.println("list4.size() = " + list4.size());

    }


}
