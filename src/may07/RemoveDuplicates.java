package may07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0, 304, 50, 203, 503, 23, 30, 50, 203, 503, 22, 100);

        Set<Integer> set=new HashSet<>();

        for(int i:list)
        set.add(i);

        System.out.println(set);

    }
}
