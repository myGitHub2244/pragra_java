package may07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(400);
        set.add(300);
        set.add(null);      //Set allows ONLY 1 Null
        set.add(50);
        set.add(10);        //Set does not allow addition of duplicates. This add will be discarded
        set.add(null);      //Set does not allow addition of duplicates including NULL . This add will be discarded

        System.out.println(set);

        //Set can be traversed using iterator and for-each loop

        //using iterator
        Iterator<Integer> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        // using for-each loop
        for(Integer e:set){
            System.out.println("Element: "+ e);
            if(e!=null)
            System.out.println("Hashcode: " +e.hashCode());
        }


    }

}
