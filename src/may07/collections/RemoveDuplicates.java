package may07.collections;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0, 304, 50, 203, 503, 23, 30, 50, 203, 503, 22, 100);

        Set<Integer> uniq=new HashSet<>();
        List<Integer> dupl=new ArrayList<>();

        for(int i:list){
            if(uniq.add(i)){        //add function (in Set class) returns false if add rejected i.e. in case of duplicate
                System.out.println("Unique element: "+i);
            }
            else{
                System.out.println("Duplicate element: "+i);
                dupl.add(i);        //fyi, this add will always return true bcoz ArrayList allows duplicates.
            }

        }
        System.out.println("List of Unique elements: "+uniq);
        System.out.println("List of Duplicate elements: "+dupl);

    }
}
