package may07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10); list.add(20);list.add(30);

        System.out.println(list);

        Iterator<Integer> iterator= list.iterator(); //Returns an array containing all of the elements in this list in proper sequence (from first to last element).

        while (iterator.hasNext()){
            Integer next=iterator.next();
            System.out.println(next);
        }

        list.add(40);
        list.add(50);

        Iterator<Integer> iterator1 = list.iterator();

//        for(Integer e:list){
//            list.remove(e); // throws ConcurrentModificationException hence use iterator's remove method as below
//        }

        while (iterator1.hasNext()){
            Integer next = iterator1.next();
            if(next == 10) {

                iterator1.remove();
            }
        }
        System.out.println(list);

    }
}
