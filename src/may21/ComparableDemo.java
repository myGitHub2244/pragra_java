package may21;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparableDemo {

    public static void main(String[] args) {

        List<Integer> list = List.of(22,44,55,66,77,88,99);

        System.out.println("Print 25 Random numbers in ascending order using Comparable method compareTo");

        //Generate Stream using Supplier function and limit 25 entries and sort in ascending and print
        Stream.generate(()->Math.random()*100).limit(25).
                sorted((a,b)->a.intValue()-b.intValue()).
                forEach(n-> System.out.println(n));


        System.out.println("Print 25 Random numbers in descending order");

        //Generate Stream using Supplier function and limit 25 entries and sort in ascending and print
        Stream.generate(()->Math.random()*100).limit(25).
                sorted((a,b)->b.intValue()-a.intValue()).
                forEach(n-> System.out.println(n));


        System.out.println("Print Array of String");
        List<String> names = List.of("Arun","Vivek","John","Arun","Robert","Steve");

        Stream.of(names).forEach(n-> System.out.println(n));
        names.stream().forEach(n-> System.out.println(n));

        System.out.println("Print Array of String in Descending Order using Comparable method compareTo");
        names.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);



    }

}
