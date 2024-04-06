package march23;

public class PostandPreIncrement {

    public static void main(String args[]){
        int g = 5;
        int h = 2* ++g;     //prefix ++ will first increment g by 1 (i.e. 6) and then use in  multiply operation
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        System.out.println("h = " + h);
        h = 3 *g++;        //suffix ++ will first use g (i.e. 6) in multiply operation and then increment g by 1 (7)
        System.out.println("g = " + g);
        System.out.println("h = " + h);


        System.out.println("h = " + h);
        h = 3 *g++ + g;        //suffix ++ will first use g (i.e. 6) in multiply operation and then increment g by 1 (7)
        System.out.println("g = " + g);
        System.out.println("h = " + h);


        System.out.println("h = " + h);
        h = h++;        //IMPORTANT: suffix ++ will first use h to assign. Looks like it will discard ++
        System.out.println("h = " + h);


    }
}
