package april06.constructor;

public class Animal {

    int height ;
    String color;
    int numLegs;
    boolean tail;

    Animal(){
        super();    //optional. The super() calls the default constructor of parent class which is Object class in this case ! Should be 1st statement
        System.out.println("Calling default Constructor i.e. with no Parameters");
        height=10;
        color="black";
        System.out.println("height = " + height);
        System.out.println("color = " + color);
        System.out.println("numLegs = " + numLegs);     //This will have default int value = 0
        System.out.println("tail = " + tail);           //This will have default boolean value = false
    }

    Animal(int ht,String cr,int nL,boolean tl){
        this(); //optional. this() calls the default constructor of same class. Should be 1st statement
        System.out.println("Calling parameterized Constructor i.e. having Parameters");
        height=ht;
        color=cr;
        numLegs=nL;
        tail=tl;
        System.out.println("height = " + height);
        System.out.println("color = " + color);
        System.out.println("numLegs = " + numLegs);     //This will have default int value = 0
        System.out.println("tail = " + tail);           //This will have default boolean value = false
    }

    void Animal(){          //the moment we add a return type, this becomes a method and not Constructor !!
        System.out.println("This is not a Constructor, this is a method");
    }
}
