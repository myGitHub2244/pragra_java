package april20;

public final class Final_KeyWord {          //final class cannot be extended

    final int x=10;     //final variable must be initialized at declaration itself
    //x=20;             //cannot change value of final variable !

}

//public class Child extends Final_KeyWord      --> Cannot extend a final Class



class Not_Final {          //final class cannot be extended

    final int x=10;     //final variable must be initialized at declaration itself
    //x=20;             //cannot change value of final variable !

    public final void test(){           //final methods cannot be overridden in child class
        System.out.println("Test Final method");
    }

    //Main method can be made Final, but now the child class cannot override or have another main method !
    public static final void main(String[] args) {
        System.out.println("Inside Parent class Main method");
    }
}

class Child extends Not_Final{
    int x;      //final field can be overidden in child class

//    public void test() {
//        System.out.println("Final method cannot be overridden");
//    }

    //child class cannot have another main method because it was final in parent class. remove final and it allows !
    //-------------------------------------------------------------------------------------------------------//
//    public static void main(String[] args) {
//        System.out.println("Inside Child class Main method");
//    }
}


