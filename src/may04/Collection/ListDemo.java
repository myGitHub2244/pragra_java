package may04.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
A List can contain duplicates, but a Set can’t
A List will preserve the order of insertion i.e. elements gets added via add() in order, but a Set may or may not
Since insertion order may not be maintained in a Set, it doesn’t allow index-based access as in the List

ArrayList uses an array, which allows for fast random access but slow insertion and deletion.
While LinkedList uses a doubly linked list, which allows for fast insertion and deletion but slow random access.

Also one of the major difference lies in the access time. ArrayList provides O(1) time complexity for index-based access
but O(n) for insertions and removals within the list. In contrast, LinkedList offers O(1) time complexity for insertions and
removals but O(n) for index-based access, as it requires traversing the list.

How the ArrayList works
The ArrayList class has a regular array inside it. When an element is added, it is placed into the array.
If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

How the LinkedList works
The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link
to the next container in the list. To add an element to the list, the element is placed into a new container and that container
is linked to one of the other containers in the list.

*/

public class ListDemo {
    public static void main(String[] args) {

        List<Integer> list = List.of(10, 20, 30);
        System.out.println("list = " + list);

        List arr=Arrays.asList(10,20,30);
        System.out.println("arr = " + arr);

        ArrayList list1=new ArrayList();        //heterogeneous array
        System.out.println("list1.size() = " + list1.size());       //initial size is 0
        list1.add(10);      //in case of ArrayList the elements are added in order of add i.e. towards end of array unless index is specified.
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
        list4.add("Pankaj");    //in case of List the elements are added in order of add i.e. towards end of array unless index is specified.
        list4.add("Toronto");
        list4.add("Pragra");
        list4.add(1,"India");
        System.out.println("list4.size() = " + list4.size());
        System.out.println("list4 = " + list4);

        System.out.println("list4.get(2) = " + list4.get(2));   //access elements using Index !

        list4.addAll(list3);        //Add a ArrayList to a LinkedList !
        System.out.println("list4 = " + list4);
        System.out.println("list4.size() = " + list4.size());

    }


}
