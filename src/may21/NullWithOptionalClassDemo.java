package may21;

import java.util.Objects;
import java.util.Optional;

public class NullWithOptionalClassDemo {

    String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static Optional<NullWithOptionalClassDemo> getObject(){
        return null;
    }


    public static void main(String[] args) {

        //Receive object using Reference of Optional class, so incase object is null it can be handled gracefully !

        Optional<NullWithOptionalClassDemo> opt = NullWithOptionalClassDemo.getObject();

        if(opt.isPresent()){
            NullWithOptionalClassDemo optObj = opt.get();
            System.out.println("firstName: "+optObj.firstName);
        }

    }


}
