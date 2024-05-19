package april13;

public class EqualsMethodStringVsObject {

    String str;

    public EqualsMethodStringVsObject(String str) {
        this.str = str;
    }

    public static void main(String[] args) {

        Object obj1=new EqualsMethodStringVsObject("Hello");
        Object obj2=new EqualsMethodStringVsObject("Hello");

        String str1=new String("Hello");
        String str2=new String("Hello");

//      Compare objects using logical operator ==
        System.out.println("== operator: "+obj1==obj2); //false

//      Compare objects using equals() method of Object class
        System.out.println("Equals method for Class that DOES NOT override equals method: "+obj1.equals(obj2)); //false
        System.out.println("Equals method for Class that DOES NOT override equals method: "+obj1.equals(str2)); //false

//      Compare objects using logical operator ==
        System.out.println("== operator: "+str1==str2); //false

//      Compare objects using equals() method of String class. equals() method has been overridden in String to compare contents
        System.out.println("Equals method for Class that override equals method: "+str1.equals(str2));  //true
        System.out.println("Equals method for Class that override equals method: "+str1.equals("Hello"));  //true


    }

}
