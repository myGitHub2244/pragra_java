package may21;


import java.util.function.Function;

public class FunctionDemo {

    public void printStudent(Function<StudentClass,String> fun){
        StudentClass stu=new StudentClass("John","Trovolta");
        System.out.println("Firstname = " + fun.apply(stu));
    }

    public static void main(String[] args) {
        FunctionDemo fun = new FunctionDemo();
        fun.printStudent(n-> n.firstName);
    }

            /*
        Above Lambda expression is short form of below implementation:
        Function<String> cons = new Consumer<>{            --> Anonymous class
            public String apply(StudentClass stu){          --> Override the abstract method: R apply(T t)
                return stu.firstname;
            }
        };

@FunctionalInterface
public interface Function<T, R> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result

     R apply(T t);
    */

}
