package april09;

public class StaticVar {

    static int staticCount=0;
    int nonstaticCount=0;

    StaticVar(){
        staticCount++;      //static variable is not init for each Object, hence previous values is incremented
        nonstaticCount++;
        System.out.println("staticCount = " + staticCount);
        System.out.println("nonstaticCount = " + nonstaticCount);
    }

    public static void main(String[] args) {
        StaticVar s1=new StaticVar();
        StaticVar s2=new StaticVar();
        StaticVar s3=new StaticVar();
    }


}
