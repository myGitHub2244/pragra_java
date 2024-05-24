package may21;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        List<Integer> list = List.of(22,44,55,66,77,88,99);

        Stream<Integer> numberStream = list.stream();

//        List<Integer> oddnumber = numberStream.filter(n->n%2!=0).map(n->n*n).map(a->String.valueOf(a)).map(s->s+s).collect(Collectors.toList());

        List<Integer> oddnumber = numberStream.filter(n->n%2!=0).map(n->n*n).collect(Collectors.toList());

        System.out.println("oddnumber = " + oddnumber);

    }

}
