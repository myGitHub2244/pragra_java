package may18.FunctionalInterface;

@FunctionalInterface    //add the annotation to ensure the compiler restricts to put only 1 abstract method.
// If we don't give this annotation them multiple abstract method can be added, but then it is NOT Functional Interface!
public interface IPlay {

    int a=10;       //Instance variables are by-default public static final. even if write it, it will be greyed out !
    public static final int b=20; //public static final is not needed to write. It is by default implied

    //only-one abstract method
    String cricketPlay();       //Functional Interface can have ONLY ONE abstract method. If you add more it fives error

    //static methods are allowed
    static String cricketPlay2(){
        return "Play";
    }

    //concrete methods allowed by writing default
    default String cricketPlay3(){
        System.out.println("Inside parent Interface");
        return "Cricket";
    }



}
