package april06.constructor;

import java.sql.SQLOutput;

public class MethodOverLoading {

//    Method Overloading

    /*
    Method overloading in java is a feature that allows a class to have more than one method with the same name, but with different parameters.

    Java supports method overloading through two mechanisms:
        By changing the number of parameters
        By changing the data type of parameters
        Note: Same method name, same type and number of parameters but a different return type is not allowed & is also not overloading
                                                                                               --------------
     */

    // Overloaded sum(). This sum takes two int parameters
    public int sum(int x, int y) {
        return (x + y);
    }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    // Overloaded sum(). This sum also takes two parameters but different data type and also different return type
    public double sum(double x, double y){
        return (x + y);
    }

    // INVALID: Overloaded sum(). This sum also takes two parameters but same data type but different return type is not allowed
//    public int sum(double x, double y){
//        int z = 10;
//        return (z);
//    }


    public static void main(String args[])
    {
        MethodOverLoading s = new MethodOverLoading();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10,20,30));
        System.out.println(s.sum(10.5,20.5));
    }

//    public void main(String args[]){
//        System.out.println("main method cannot be overloaded by removing static. Gives compile Error");
//    }
//
//    public static String main(String args[]){
//        System.out.println("main method cannot be overloaded by changing Return type. Gives compile Error");
//        return args[0];
//    }

    public static void main(Integer args[]){
        System.out.println("main method CAN be overloaded by changing parameter Type !!");
    }


}
