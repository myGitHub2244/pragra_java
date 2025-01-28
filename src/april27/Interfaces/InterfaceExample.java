package april27.Interfaces;

public interface InterfaceExample {

//  int x;          // Variables must be public static final. Cannot have instance variables. And MUST be initialized !
    int x=1;        // No need to mention public static final exclusively, it is implied as long as field is initialized

    //public abstract is greyed out meaning it is default/implied hence can be omitted
    public static final int y=2;

    //Constructor are not allowed. Also it is not needed bcoz there are no instance variables/methods for objects
    //Interfaces cannot be instantiated. But can be used as Object reference !
//    InterfaceExample(){
//    }



    //methods are by default public abstract

    void show();

    //public abstract is greyed out meaning it is default/implied hence can be omitted
    public abstract void display();


}
