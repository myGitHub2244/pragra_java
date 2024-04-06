package april06.constructor;

public class Animal {

    int height;
    String color;
    int numLegs;
    boolean tail;

    Animal(){
        System.out.println("Calling default Constructor i.e. with no Parameters");
        height=10;
        color="black";
        System.out.println("height = " + height);
        System.out.println("color = " + color);
        System.out.println("numLegs = " + numLegs);     //This will have default int value = 0
        System.out.println("tail = " + tail);           //This will have default boolean value = false
    }

    Animal(int ht,String cr,int nL,boolean tl){
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


}
