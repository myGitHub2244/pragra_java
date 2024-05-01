package april30.ThrowVSThrows;

public class Throws {
    public static void main(String[] args) throws NullPointerException{

        show1();
    }


    public static void show1() throws NullPointerException{
        show2();
    }

    public static void show2() throws NullPointerException{
        show3();
    }

    public static void show3() throws NullPointerException{

         show4();
    }

    public static void show4() throws NullPointerException{

            String s = null;
            String upperCase = s.toUpperCase();
            System.out.println(upperCase);

        System.out.println("After exception..");
    }


}



