package may21;

import java.util.Objects;
import java.util.Optional;

public class NullWithoutOptionalClassDemo {

    String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static NullWithoutOptionalClassDemo getObject(){
        return null;
    }


    public static void main(String[] args) {

        NullWithoutOptionalClassDemo opt = NullWithoutOptionalClassDemo.getObject();

        System.out.println("Object: "+opt);     //prints null... does not give NullPointerException
//        System.out.println("firstName: "+opt.firstName);    //gives NullPointerException when a null object is used to invoke a method

        //how to check null
        if(Objects.nonNull(opt)){   //this is one way to prevent NullPointerException, by putting null object as parameter
            System.out.println("firstName: "+opt.firstName);
        }
        if(null!=opt){          //this is another way to prevent NullPointerException
            System.out.println("firstName: "+opt.firstName);
        }

    }


}
