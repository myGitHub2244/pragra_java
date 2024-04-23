package april16;

public class StringBuffer {

    public static void main(String[] args) {
        String s1=new String("Mouse");
        System.out.println(s1);   //prints value "Mouse" bcoz toString is overidden in String class

        s1.concat(" Trap");
        System.out.println(s1); //Still prints "Mouse" and not "Mouse Trap" !!

        String s2= s1.concat(" Trap");
        System.out.println(s2); //Prints "Mouse Trap"

        //StringBuffer and StringBuilder are mutable
        //StringBuffer is thread-safe whereas StringBuilder is not thread-safe

//        StringBuffer sb=new StringBuffer("Jan");
//
//        System.out.println(sb);
//        sb.append(" Feb");
//        System.out.println(sb);


    }

}
