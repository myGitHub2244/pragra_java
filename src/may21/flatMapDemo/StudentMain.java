package may21.flatMapDemo;

import java.util.List;
import java.util.Optional;

public class StudentMain {


    public static void main(String[] args) {

        List courses = List.of("Math","Science","Geo","History");
        List<Student> stu = List.of(
                new Student("John","Wick",courses),
                new Student("Peter","Gere",courses),
                new Student("Jichard","Waugh",courses),
                new Student("Steve","Wick",courses)
        );

        //flatMap is used to get all data extracted from List containing another List so we can work upon entire Data
        stu.stream()
                .filter(s->s.getFirstName().startsWith("J"))
                .flatMap(s->s.getCourses().stream())
                .forEach(System.out::println);


        //Demonstrate use of Optional via findAny !
        Optional<String> j = stu.stream()
                .filter(s -> s.getFirstName().startsWith("J"))
                .flatMap(s -> s.getCourses().stream())
                .filter(c -> c.length() > 10)       //there are no course names with length > 10, so this returns null
                .findAny();//makes use of Optional class and handles null gracefully !

        System.out.println("j = " + j);

    }
}
