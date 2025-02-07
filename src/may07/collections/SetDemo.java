package may07.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

//A List can contain duplicates, but a Set can’t
//A List will preserve the order of insertion i.e. elements gets added via add() in order, but a Set may or may not
//Since insertion order may not be maintained in a Set, it doesn’t allow index-based access as in the List


    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(400);
        set.add(300);
        set.add(null);      //Set allows ONLY 1 Null
        set.add(50);
        set.add(10);        //Set does not allow addition of duplicates. This add will be discarded and returns FALSE!
        set.add(null);      //Set does not allow addition of duplicates including NULL . This add will be discarded

        System.out.println(set);

        //Set can be traversed using "iterator" and "for-each" loop. Note: And Cannot use "for" loop because no index !

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
