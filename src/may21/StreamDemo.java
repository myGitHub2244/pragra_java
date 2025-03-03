package may21;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        List<Integer> list = List.of(22,44,55,66,77,88,99);

        Stream<Integer> numberStream = list.stream();
        List<String> oddnumber1 = numberStream
                .filter(n->n%2!=0)          //uses Predicate function   boolean test(T t)
                .map(n->n*n)    //uses Function function    R apply(T t)
                .map(a->String.valueOf(a))
                .map(s->s+s)
                .collect(Collectors.toList());
        System.out.println("oddnumber1 = " + oddnumber1);

        List<Integer> oddnumber = list.stream()
                .filter(n->n%2!=0)
                .map(n->n*n)
                .collect(Collectors.toList());
        System.out.println("oddnumber = " + oddnumber);


//        Stream.of(list).filter(n->n%2!=0).count();

        System.out.println("Print 25 Random numbers");
        //Generate Stream using Supplier function and limit 25 entries and print
        Stream.generate(()->Math.random()*100)      //uses Supplier function    T get()
                .limit(25)
                .forEach(n-> System.out.println(n));    //uses Consumer function    void accept(T t)

        System.out.println("Print 25 Random numbers in ascending order");

        //Generate Stream using Supplier function and limit 25 entries and sort in ascending and print
        Stream.generate(()->Math.random()*100)
                .limit(25)
                .sorted((a,b)->a.intValue()-b.intValue())   //uses Comparator interface and implements compare(T o1, T o2) in Lambda
                .forEach(n-> System.out.println(n));


        System.out.println("Print 25 Random numbers in descending order");

        //Generate Stream using Supplier function and limit 25 entries and sort in ascending and print
        Stream.generate(()->Math.random()*100)
                .limit(25)
                .sorted((a,b)->b.intValue()-a.intValue())   //uses Comparator interface and implements compare(T o1, T o2) in Lambda
                .forEach(n-> System.out.println(n));


        System.out.println("Print 25 Random numbers in descending order converted to Int and divisible by 3");
        //Generate Stream using Supplier function and limit 25 entries and convert to Int and sort in ascending and print
        Stream.generate(()->Math.random()*100)
                .limit(25)
                .sorted((a,b)->b.intValue()-a.intValue())   //uses Comparator interface and implements compare(T o1, T o2) in Lambda
                .mapToInt(a->a.intValue())  //converts the stream to Integer
                .filter(n->n%3==0)
                .forEach(n-> System.out.println(n));


        System.out.println("Print Array of String");
        List<String> names = List.of("Arun","Vivek","John","Arun","Robert","Steve");

        System.out.println("2 ways to create Streams:");
        Stream.of(names).forEach(n-> System.out.println(n));
        names.stream().forEach(n-> System.out.println(n));

        //Now to sort a Stream of Strings, we cannot use Comparator (a,b)-> a-b but need to use Comparable interface compareTo Lambda
        System.out.println("Print Array of String in Descending Order using Comparable method compareTo");
        names.stream()
                .sorted((a,b)->b.compareTo(a))  //uses and implements Comparable interface compareTo method using Lambda expression
            //  .sorted(Comparator.reverseOrder())  //this will also work to sort in descending order !
                .forEach(System.out::println);

        System.out.println("Print Array of String removing duplicates using distinct()");
        names.stream()
                .sorted((a,b)->b.compareTo(a))
                .distinct()
                .forEach(System.out::println);


        System.out.println("Demo of reduce() to perform complex mathematical operation");
        List<Integer> list1 = List.of(22,44,55,66,77,88,99);

        System.out.println("Math operation: " +list1.stream()
                .filter(n->n%2==0)
                .reduce(0,(sum,nextInt)->sum+nextInt));     //0+22+44+55.... -> performs math operation and gives 1 output
                                                                    //reduce is a terminal operation !!
    }

}
