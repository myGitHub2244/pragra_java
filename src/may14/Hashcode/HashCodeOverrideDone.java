package may14.Hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeOverrideDone {

    public static void main(String[] args) {
        StudentHashOverride s1=new StudentHashOverride("John","Cen");       //Create Key
        StudentHashOverride s2=new StudentHashOverride("Pete","Bravo");

        Map<StudentHashOverride,Integer> map=new HashMap<>();   //Create a Map with Student as Key and Integer i.e. marks as Values
        map.put(s1,70);
        map.put(s2,80);
        System.out.println("map = " + map);
        System.out.println("Marks of Student s1 is: "+ map.get(s1));

        //Now try to retrieve with another Key (new object) which has value exact same as s1:
        System.out.println("Marks of Student s1 is: "+ map.get(new StudentHashOverride("John","Cen"))); //returns correct value
        //because hashcode() has been overridden in StudentHashOverride class to generate hashcode on basis of object values.
        // Hence same hashcode is generated for a given value of object.

        //generate and print hashcodes:          --> Should be same for both objects since we have overridden the hashCode() method to always return same hashcode for same value of an object
        System.out.println("s1 = " + s1.hashCode());
        System.out.println("new StudentHashOverride(\"John\",\"Cen\") = " + new StudentHashOverride("John", "Cen").hashCode());

        //Above although we tried to retrieve using exact same key, still it could not retrieve the corresponding value !
        //Reason: The hashcode of the new object created in line# 24 is not same as hashcode of object s1
        //          Hence, if we use the new object to retrieve it will NOT match with s1 hashcode hence does not retrieve it !

        //Solution: Override the hashcode method in Student class, so that each time a new object is created with exact same
        //          values, the hashcode generated will also be exact same !

        //Update the name attribute in object s1. Note: hashcode() we override (StudentHashOverride class) uses object value and not memory location
        // Hence changing objects value (although same memory loc) will now change hashcode as well
        //And if we use it in HashMap as key  to locate then it will fetch Null !

        s1.setName("Michael");  //replace name John with Michael. The object s1 memory location is still same but hashcode is changed!
        System.out.println("s1.hashCode() = " + s1.hashCode()); //hashcode changed since it is now based on value as we override it in StudentHashOverride class
        //map.get(s1) below will still retrieve correct corresponding value (marks) even if key S1 (name) was updated
        System.out.println("Marks of Student s1 is: "+ map.get(s1));


        //Above although we tried to retrieve using exact same key, still it could not retrieve the corresponding value !
        //Reason: The hashcode of the new object created in line# 24 is not same as hashcode of object s1
        //          Hence, if we use the new object to retrieve it will NOT match with s1 hashcode hence does not retrieve it !

        //Solution: Override the hashcode method in Student class, so that each time a new object is created with exact same
        //          values, the hashcode generated will also be exact same !

    }


}
