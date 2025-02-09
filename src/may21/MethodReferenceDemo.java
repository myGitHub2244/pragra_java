package may21;

import java.util.List;
import java.util.stream.Stream;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        System.out.println("Print Array of String");
        List<String> names = List.of("Arun","Vivek","John","Arun","Robert","Steve");

        names.stream()
                .forEach(n-> System.out.println(n));

        System.out.println("Print Array of String using Method Reference");
        names.stream()
                .forEach(System.out::println);      //Method reference can be used in place of Lambda. It is more simplified


    }


}
