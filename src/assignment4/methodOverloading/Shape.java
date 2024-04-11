package assignment4.methodOverloading;

public class Shape {


    //Area of shape using method overloading
    public double areaShape(double radius){
        return 3.14*radius*radius;
    }

    public int areaShape(int length, int width){
        return length*width;
    }

    public int areaShape(int length){
        return length*length;
    }

    public static void main(){      // ** main method can also be overloaded !
        System.out.println("main method can also be overloaded by type or number of Parameter !!");
    }

//    public static String main(String args[]){      // ** main method cannot be overloaded by just Return Type !
//        System.out.println("main method cannot be Overloaded by Return type. Uncomment this code and See error!!");
//        return args[0];
//    }


    public static void main(String[] args) {

        Shape sh=new Shape();
        System.out.println("Area of Circle = " + sh.areaShape(4.5));
        System.out.println("Area of Rectangle = " + sh.areaShape(3,4));
        System.out.println("Area of Square = " + sh.areaShape(5));
    }


}
