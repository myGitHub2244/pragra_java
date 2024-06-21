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

        System.out.println("Object: "+opt);     //prints null
//        System.out.println("firstName: "+opt.firstName);    //gives NullPointerException

        //how to check null
        if(Objects.nonNull(opt)){
            System.out.println("firstName: "+opt.firstName);
        }
        if(null!=opt){
            System.out.println("firstName: "+opt.firstName);
        }

    }


}
