package april09;

public class InstanceBlock {
    int x;
    static{
        System.out.println("Static block is always executed first");
    }

    InstanceBlock(){
        this.x=01;  //we can use this inside the constructor !
        System.out.println("Inside Constructor: Executed at time of Object creation, but after Instance Block: "+x);
    }

    // This is an Instance Block which is executed at time of Object Creation (before Constructor)
    {
        this.x = 10;        //we can refer instance variables using "this" inside the instance block !
        System.out.println("This is an Instance block, which executed only at Object creation: " +x);

    }

    // This is an Instance Block #2 which is executed at time of Object Creation
    {
        this.x = 20;
        System.out.println("This is an Instance block #2, which executed only at Object creation: "+x);
    }


    public static void main(String[] args) {


        System.out.println("This is executed after Static block");
        InstanceBlock inst=new InstanceBlock();

    }
}
