package may21.flatMapDemo;

import java.util.List;

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

    }
}
