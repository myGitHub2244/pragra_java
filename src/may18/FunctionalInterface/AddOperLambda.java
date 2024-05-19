package may18.FunctionalInterface;

public class AddOperLambda implements IAddOper{

    @Override
    public int addNum(int a, int b) {
        return a+b;
    }


    public static void main(String[] args) {

        //Override using Anonymous Inner Class:
        IAddOper add1=new IAddOper() {
            @Override
            public int addNum(int a, int b) {
                return a+b;
            }
        };
        System.out.println("add1.addNum(2,3) = " + add1.addNum(2, 3));

        //Override using Lambda Expression #1:
        IAddOper add2=(a,b)->a+b;
        System.out.println("add2.addNum(3,4) = " + add2.addNum(3, 4));

        //Override using Lambda Expression #2:
//        System.out.println("(a,b)->a+b = " + (a,b) -> a+b);

        //Override using Lambda Expression #3:      --> We can override the same abstract methods number of times !
        IAddOper add3=(a,b)->{
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            return a+b;
        };
        System.out.println("add3.addNum(5,6) = " + add3.addNum(5, 6));

    }

}
