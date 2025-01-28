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

}

class Child extends Not_Final{
    int x;      //final field can be overidden in child class

//    public void test() {
//        System.out.println("Final method cannot be overridden");
//    }
}


