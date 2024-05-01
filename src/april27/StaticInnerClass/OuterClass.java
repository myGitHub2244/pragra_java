package april27.StaticInnerClass;

public class OuterClass {

    int x=10;

    /*
    An inner class can also be static, which means that you can access it without creating an object of the outer class:
     */

    static class InClass{               //Static Inner Class
        int y=20;
        public void insideMethod(){
            System.out.println("Inside Method");
        }
    }
}

class MainDemo{
    public static void main(String[] args) {
        OuterClass.InClass inClass=new OuterClass.InClass();    //For Static Inner Class we do not need obj of Outer classes as was in case of non-Static Inner Class
        inClass.insideMethod();
    }
}