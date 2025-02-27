package may07.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10); list.add(20);list.add(30);

        System.out.println(list);


        //Trying to remove items using a for loop or a for-each loop would not work correctly because
        // the collection is changing size at the same time that the code is trying to loop.
//        for(Integer i:list){
//            System.out.println(i);
//            list.remove(i);     //Causes java.util.ConcurrentModificationException at line 19 because remove changed the arrayList length
//        }


        //An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
        // It is called an "iterator" because "iterating" is the technical term for looping thru every index.


        Iterator<Integer> iterator= list.iterator(); //Returns an iterator for the invoking collection.

        while (iterator.hasNext()){
            Integer next=iterator.next();
            System.out.println(next);
            iterator.remove();        //Does not causes java.util.ConcurrentModificationException
        }

        list.add(40);
        list.add(50);

        Iterator<Integer> iterator1 = list.iterator();

//        for(Integer e:list){
//            list.remove(e); // List's remove() gives ConcurrentModificationException hence use iterator's remove method as below
//        }

        while (iterator1.hasNext()){
            Integer next = iterator1.next();
            if(next == 10) {
//              list.remove(new Integer(10));   // List's remove() gives ConcurrentModificationException hence use iterator's remove method as below
                iterator1.remove();     //it removes last retrieved element !
            }
        }
        System.out.println(list);

    }
}
