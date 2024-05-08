package may07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10); list.add(20);list.add(30);

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        for(Integer element:list){
            System.out.println(element);
        }

        Iterator<Integer> iterator= list.iterator();    //Returns an array containing all of the elements in this list in proper sequence (from first to last element).

        while (iterator.hasNext()){
            Integer next=iterator.next();
            System.out.println(next);
        }
    }
}
