package april09;

public class InstanceBlock {

    static{
        System.out.println("Static block is always executed first");
    }

    InstanceBlock(){
        System.out.println("Inside Constructor: Executed at time of Object creation, but after Instance Block");
    }

    // This is an Instance Block which is executed at time of Object Creation (before Constructor)
    {
        System.out.println("This is an Instance block, which executed only at Object creation");
    }

    // This is an Instance Block #2 which is executed at time of Object Creation
    {
        System.out.println("This is an Instance block #2, which executed only at Object creation");
    }


    public static void main(String[] args) {


        System.out.println("This is executed after Static block");
        InstanceBlock inst=new InstanceBlock();

    }
}
