package may21;

import may21.flatMapDemo.Student;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class NullWithOptionalClassDemo {

    String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static Optional<NullWithOptionalClassDemo> getObject(){
        return null;
    }


    public static void main(String[] args) {

        //Receive object using Reference of Optional class, so incase object is null it can be handled gracefully !

        Optional<NullWithOptionalClassDemo> opt = NullWithOptionalClassDemo.getObject();

        if(opt.isPresent()){
            NullWithOptionalClassDemo optObj = opt.get();
            System.out.println("firstName: "+optObj.firstName);
        }


        List courses = List.of("Math","Science","Geo","History");
        List<Student> stu = List.of(
                new Student("John","Wick",courses),
                new Student("Peter","Gere",courses),
                new Student("Jichard","Waugh",courses),
                new Student("Steve","Wick",courses)
        );

        //Demonstrate use of Optional via findAny !
        Optional<String> j = stu.stream()
                .filter(s -> s.getFirstName().startsWith("J"))
                .flatMap(s -> s.getCourses().stream())
                .filter(c -> c.length() > 10)       //there are no course names with length > 10, so this returns null
                .findAny();//makes use of Optional class and handles null gracefully !

        System.out.println("j = " + j);

    }


}
