package april06.constructor;

public class MethodOverLoading {

//    Method Overloading

    /*
    Method overloading in java is a feature that allows a class to have more than one method with the same name, but with different parameters.

    Java supports method overloading through two mechanisms:
        By changing the number of parameters
        By changing the data type of parameters

     */

    // Overloaded sum(). This sum takes two int parameters
    public int sum(int x, int y) {
        return (x + y);
    }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    // Overloaded sum(). This sum takes two double parameters
    public double sum(double x, double y){
        return (x + y);
    }

    public static void main(String args[])
    {
        MethodOverLoading s = new MethodOverLoading();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10,20,30));
        System.out.println(s.sum(10.5,20.5));
    }


}
